package com.example.yogaapp.screens

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import com.example.yogaapp.R
import com.example.yogaapp.adapter.PoseAdapter
import com.example.yogaapp.databinding.FragmentMainBinding
import com.example.yogaapp.model.Pose

class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(inflater, container, false)

        val poses = ArrayList<Pose>()
        poses.add(Pose("Mountain Pose", R.drawable.mountain_pose_tadasana_for_beginners))
        poses.add(Pose("Tree Pose", R.drawable.tree_pose))
        poses.add(Pose("Triangle Pose", R.drawable.triangle_pose_or_trikonasana))
        poses.add(Pose("Warrior I Pose", R.drawable.warrior_i_or_virabhadrasana_1))
        poses.add(Pose("Downward-Facing Dog Pose", R.drawable.downword_facing_dog_pose))
        poses.add(Pose("Upward-Facing Dog Pose", R.drawable.upword_facing_dog_pose))
        poses.add(Pose("Seated Forward Fold Pose", R.drawable.seated_forward_fold_or_paschimottanasana))
        poses.add(Pose("Bridge Pose", R.drawable.bridge_pose))
        poses.add(Pose("Child Pose", R.drawable.balasana_or_childs_pose))
        poses.add(Pose("Savasana Pose", R.drawable.savasana_or_corpse_pose))

        val poseAdapter = PoseAdapter()
        poseAdapter.setData(poses)
        binding.rv.adapter = poseAdapter

        return binding.root
    }

}