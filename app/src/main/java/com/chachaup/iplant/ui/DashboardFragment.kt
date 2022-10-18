package com.chachaup.iplant.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import com.chachaup.iplant.R
import com.chachaup.iplant.RandomUserResponse
import com.chachaup.iplant.UserProfileViewModel
import com.chachaup.iplant.databinding.FragmentDashboardBinding
import com.chachaup.iplant.network.ProfileClient
import com.chachaup.iplant.network.ProfileClient.client
import com.chachaup.iplant.network.UserAPI
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import retrofit2.Response

class DashboardFragment : Fragment() {
    val viewModel: UserProfileViewModel by viewModels()
    private lateinit var binding: FragmentDashboardBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_dashboard, container, false)
        return binding.root
    }

    @OptIn(DelicateCoroutinesApi::class)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        GlobalScope.launch {
            val response = client.getProfile()
            if (response.isSuccessful){
                Toast.makeText(context, response.body()?.results?.get(0)?.name?.last, Toast.LENGTH_SHORT).show()

            }
        }

    }


}