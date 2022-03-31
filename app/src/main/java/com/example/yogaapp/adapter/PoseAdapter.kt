package com.example.yogaapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.yogaapp.databinding.ListItemPoseBinding
import com.example.yogaapp.model.Pose

class PoseAdapter: RecyclerView.Adapter<PoseAdapter.ViewHolder>() {

    var poseList: List<Pose> = ArrayList()

    fun setData(data: List<Pose>) {
        poseList = data
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(poseList[position])
    }

    override fun getItemCount(): Int {
        return poseList.size
    }

    class ViewHolder(private val binding: ListItemPoseBinding) : RecyclerView.ViewHolder(binding.root) {
        companion object{
            fun from(parent: ViewGroup): ViewHolder{
                val inflater = LayoutInflater.from(parent.context)
                val binding = ListItemPoseBinding.inflate(inflater, parent, false)
                return ViewHolder(binding)
            }
        }

        fun bind(pose: Pose) {
            binding.name.text = pose.name
            binding.image.setImageResource(pose.image)
            binding.executePendingBindings()
        }
    }


}