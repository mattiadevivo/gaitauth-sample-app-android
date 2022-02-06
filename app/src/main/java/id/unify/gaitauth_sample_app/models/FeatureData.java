package id.unify.gaitauth_sample_app.models;

import com.google.gson.annotations.SerializedName;

import org.json.JSONObject;

public class FeatureData extends JSONObject {
    @SerializedName("features")
    private String features;

    public FeatureData(String features){
        this.features = features;
    }

    public String getFeatures() {return features;}
    public void setFeatures(String features) {this.features = features;}
}
