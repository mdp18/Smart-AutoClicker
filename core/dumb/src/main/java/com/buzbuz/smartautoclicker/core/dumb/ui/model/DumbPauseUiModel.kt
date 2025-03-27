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
package com.buzbuz.smartautoclicker.core.dumb.ui.model

import com.buzbuz.smartautoclicker.core.base.identifier.Identifier

data class DumbPauseUiModel(
    val id: Identifier,
    val scenarioId: Identifier,
    val name: String,
    val priority: Int,
    val minPauseDurationMs: Long,
    val maxPauseDurationMs: Long,
    val isRandomized: Boolean, // New property
    val fixedPauseDurationMs: Long, // New property
)