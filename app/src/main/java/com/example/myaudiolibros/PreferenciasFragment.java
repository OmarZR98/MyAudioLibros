package com.example.myaudiolibros;

import android.os.Bundle;

import androidx.preference.PreferenceFragmentCompat;

public class PreferenciasFragment  extends PreferenceFragmentCompat {

    @Override public void onCreatePreferences(Bundle bundle, String s) {
        addPreferencesFromResource(R.xml.preferences);
    }

}
