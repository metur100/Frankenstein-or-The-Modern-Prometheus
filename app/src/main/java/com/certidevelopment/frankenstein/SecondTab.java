package com.certidevelopment.frankenstein;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.google.android.gms.ads.interstitial.InterstitialAd;

public class SecondTab extends Fragment {
    //private InterstitialAd mInterstitialAd;
    //private boolean euConsent = false;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.second_tab, container, false);

        //MobileAds.initialize(getContext(), new OnInitializationCompleteListener() {

//            @Override
//            public void onInitializationComplete(InitializationStatus initializationStatus) {
//
//                if(euConsent){
//                    onCreatePersonalizedAd();
//                }
//                else{
//                    onCreateNonPersonalizedAd();
//                }
//            }
//        });

        Button letter1Button = (Button) view.findViewById(R.id.letter1_button);
        Button letter2Button = (Button) view.findViewById(R.id.letter2_button);
        Button letter3Button = (Button) view.findViewById(R.id.letter3_button);
        Button letter4Button = (Button) view.findViewById(R.id.letter4_button);

        letter1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(v.getContext(), Letter1.class);
                startActivity(intent1);

               /* if (mInterstitialAd != null) {
                    mInterstitialAd.show(getActivity());
                } else {
                    Log.d("---AdMob", "The interstitial ad wasn't ready yet.");
                }*/
            }
        });

        letter2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(v.getContext(), Letter2.class);
                startActivity(intent2);

               /* if (mInterstitialAd != null) {
                    mInterstitialAd.show(getActivity());
                } else {
                    Log.d("---AdMob", "The interstitial ad wasn't ready yet.");
                }*/
            }
        });

        letter3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(v.getContext(), Letter3.class);
                startActivity(intent3);

               /* if (mInterstitialAd != null) {
                    mInterstitialAd.show(getActivity());
                } else {
                    Log.d("---AdMob", "The interstitial ad wasn't ready yet.");
                }*/
            }
        });

        letter4Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(v.getContext(), Letter4.class);
                startActivity(intent4);

               /* if (mInterstitialAd != null) {
                    mInterstitialAd.show(getActivity());
                } else {
                    Log.d("---AdMob", "The interstitial ad wasn't ready yet.");
                }*/
            }
        });

        return view;
    }
//    private void onCreatePersonalizedAd () {
//        AdRequest adRequest = new AdRequest.Builder().build();
//        createInterstitialAd (adRequest);
//    }
//
//    private void onCreateNonPersonalizedAd () {
//
//        Bundle networkExtrasBundle = new Bundle();
//        networkExtrasBundle.putInt("rdp", 1);
//        AdRequest adRequest = new AdRequest.Builder()
//                .addNetworkExtrasBundle(AdMobAdapter.class, networkExtrasBundle)
//                .build();
//
//        createInterstitialAd (adRequest);
//    }
//
//    private void createInterstitialAd(AdRequest adRequest) {
//        InterstitialAd.load(getContext(), "ca-app-pub-4083455340780305/5844265495", adRequest, new InterstitialAdLoadCallback() {
//
//            @Override
//            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
//                // The mInterstitialAd reference will be null until
//                // an ad is loaded.
//                mInterstitialAd = interstitialAd;
//                Log.i("---AdMob", "onAdLoaded");
//
//                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
//                    @Override
//                    public void onAdDismissedFullScreenContent() {
//                        // Called when fullscreen content is dismissed.
//                        Log.d("---AdMob", "The ad was dismissed.");
//                        onCreatePersonalizedAd();
//                    }
//
//                    @Override
//                    public void onAdFailedToShowFullScreenContent(AdError adError) {
//                        // Called when fullscreen content failed to show.
//                        Log.d("---AdMob", "The ad failed to show.");
//                    }
//
//                    @Override
//                    public void onAdShowedFullScreenContent() {
//                        // Called when fullscreen content is shown.
//                        // Make sure to set your reference to null so you don't
//                        // show it a second time.
//                        mInterstitialAd = null;
//                        Log.d("---AdMob", "The ad was shown.");
//                    }
//                });
//            }
//
//            @Override
//            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
//                // Handle the error
//                Log.i("---AdMob", loadAdError.getMessage());
//                mInterstitialAd = null;
//            }
//        });
//    }
}
