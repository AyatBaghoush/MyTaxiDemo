package com.mytaxi.android_demo.DataProvider;

import android.content.res.Resources;
import android.util.Log;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.InputStreamReader;

public class JsonFileReader {

        private static JsonParser parser;
        public static JsonObject getJSONResource(Resources resources, int id) {
            try
            {
                parser = new JsonParser();
                return parser.parse(new InputStreamReader(resources.openRawResource(id))).getAsJsonObject();
            }
            catch (IllegalStateException e) {

                return null;
            }
        }


}
