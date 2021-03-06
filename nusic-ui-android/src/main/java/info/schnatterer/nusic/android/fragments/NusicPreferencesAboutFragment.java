/**
 * Copyright (C) 2013 Johannes Schnatterer
 *
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This file is part of nusic.
 *
 * nusic is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * nusic is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with nusic.  If not, see <http://www.gnu.org/licenses/>.
 */
package info.schnatterer.nusic.android.fragments;

import android.annotation.SuppressLint;
import android.os.Bundle;

import info.schnatterer.nusic.android.application.NusicApplication;
import info.schnatterer.nusic.ui.R;
import roboguice.fragment.provided.RoboPreferenceFragment;

@SuppressLint("NewApi")
public class NusicPreferencesAboutFragment extends RoboPreferenceFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Load the preferences from an XML resource
        addPreferencesFromResource(R.xml.preferences_about);

        // Set version
        findPreference(getString(R.string.preferences_key_version)).setSummary(
                NusicApplication.getCurrentVersionName());
    }
}
