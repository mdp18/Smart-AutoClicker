/*
 * Copyright (C) 2024 Kevin Buzeau
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.buzbuz.smartautoclicker.core.dumb.ui.fragment

import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.buzbuz.smartautoclicker.core.dumb.R
import com.buzbuz.smartautoclicker.core.dumb.ui.viewmodel.DumbPauseViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class DumbPauseFragment : Fragment(R.layout.fragment_dumb_pause) {

    private val viewModel: DumbPauseViewModel by viewModel()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val isRandomizedCheckbox: CheckBox = view.findViewById(R.id.is_randomized_checkbox)
        val fixedPauseDurationInput: EditText = view.findViewById(R.id.fixed_pause_duration_input)

        isRandomizedCheckbox.setOnCheckedChangeListener { _, isChecked ->
            viewModel.onRandomizedCheckedChanged(isChecked)
            fixedPauseDurationInput.visibility = if (isChecked) View.GONE else View.VISIBLE
        }

        fixedPauseDurationInput.addTextChangedListener {
            viewModel.onFixedPauseDurationChanged(it.toString())
        }
    }
}