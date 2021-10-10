package com.certidevelopment.frankenstein;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.google.android.gms.ads.interstitial.InterstitialAd;

public class FirstTab extends Fragment {


    private InterstitialAd mInterstitialAd;
    private boolean euConsent = false;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.first_tab, container, false);

//        MobileAds.initialize(getContext(), new OnInitializationCompleteListener() {
//
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

        Button chapter1Button = (Button) view.findViewById(R.id.chapter1_button);
        Button chapter2Button = (Button) view.findViewById(R.id.chapter2_button);
        Button chapter3Button = (Button) view.findViewById(R.id.chapter3_button);
        Button chapter4Button = (Button) view.findViewById(R.id.chapter4_button);
        Button chapter5Button = (Button) view.findViewById(R.id.chapter5_button);
        Button chapter6Button = (Button) view.findViewById(R.id.chapter6_button);
        Button chapter7Button = (Button) view.findViewById(R.id.chapter7_button);
        Button chapter8Button = (Button) view.findViewById(R.id.chapter8_button);
        Button chapter9Button = (Button) view.findViewById(R.id.chapter9_button);
        Button chapter10Button = (Button) view.findViewById(R.id.chapter10_button);
        Button chapter11Button = (Button) view.findViewById(R.id.chapter11_button);
        Button chapter12Button = (Button) view.findViewById(R.id.chapter12_button);
        Button chapter13Button = (Button) view.findViewById(R.id.chapter13_button);
        Button chapter14Button = (Button) view.findViewById(R.id.chapter14_button);
        Button chapter15Button = (Button) view.findViewById(R.id.chapter15_button);
        Button chapter16Button = (Button) view.findViewById(R.id.chapter16_button);
        Button chapter17Button = (Button) view.findViewById(R.id.chapter17_button);
        Button chapter18Button = (Button) view.findViewById(R.id.chapter18_button);
        Button chapter19Button = (Button) view.findViewById(R.id.chapter19_button);
        Button chapter20Button = (Button) view.findViewById(R.id.chapter20_button);
        Button chapter21Button = (Button) view.findViewById(R.id.chapter21_button);
        Button chapter22Button = (Button) view.findViewById(R.id.chapter22_button);
        Button chapter23Button = (Button) view.findViewById(R.id.chapter23_button);
        Button chapter24Button = (Button) view.findViewById(R.id.chapter24_button);

        chapter1Button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(v.getContext(), Chapter1.class);
                startActivity(intent1);

              /* if (mInterstitialAd != null) {
                    mInterstitialAd.show(getActivity());
                } else {
                    Log.d("---AdMob", "The interstitial ad wasn't ready yet.");
                }*/
            }
        });

        chapter2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(v.getContext(), Chapter2.class);
                startActivity(intent2);

               /* if (mInterstitialAd != null) {
                    mInterstitialAd.show(getActivity());
                } else {
                    Log.d("---AdMob", "The interstitial ad wasn't ready yet.");
                }*/
            }
        });

        chapter3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(v.getContext(), Chapter3.class);
                startActivity(intent3);

               /* if (mInterstitialAd != null) {
                    mInterstitialAd.show(getActivity());
                } else {
                    Log.d("---AdMob", "The interstitial ad wasn't ready yet.");
                }*/
            }
        });

        chapter4Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(v.getContext(), Chapter4.class);
                startActivity(intent4);

               /* if (mInterstitialAd != null) {
                    mInterstitialAd.show(getActivity());
                } else {
                    Log.d("---AdMob", "The interstitial ad wasn't ready yet.");
                }*/
            }
        });

        chapter5Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(v.getContext(), Chapter5.class);
                startActivity(intent5);

               /* if (mInterstitialAd != null) {
                    mInterstitialAd.show(getActivity());
                } else {
                    Log.d("---AdMob", "The interstitial ad wasn't ready yet.");
                }*/
            }
        });

        chapter6Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6 = new Intent(v.getContext(), Chapter5.class);
                startActivity(intent6);

               /* if (mInterstitialAd != null) {
                    mInterstitialAd.show(getActivity());
                } else {
                    Log.d("---AdMob", "The interstitial ad wasn't ready yet.");
                }*/
            }
        });

        chapter7Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent7 = new Intent(v.getContext(), Chapter7.class);
                startActivity(intent7);

               /* if (mInterstitialAd != null) {
                    mInterstitialAd.show(getActivity());
                } else {
                    Log.d("---AdMob", "The interstitial ad wasn't ready yet.");
                }*/
            }
        });

        chapter8Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent8 = new Intent(v.getContext(), Chapter8.class);
                startActivity(intent8);

               /* if (mInterstitialAd != null) {
                    mInterstitialAd.show(getActivity());
                } else {
                    Log.d("---AdMob", "The interstitial ad wasn't ready yet.");
                }*/
            }
        });

        chapter9Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent9 = new Intent(v.getContext(), Chapter9.class);
                startActivity(intent9);

               /* if (mInterstitialAd != null) {
                    mInterstitialAd.show(getActivity());
                } else {
                    Log.d("---AdMob", "The interstitial ad wasn't ready yet.");
                }*/
            }
        });

        chapter10Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent11 = new Intent(v.getContext(), Chapter10.class);
                startActivity(intent11);

               /* if (mInterstitialAd != null) {
                    mInterstitialAd.show(getActivity());
                } else {
                    Log.d("---AdMob", "The interstitial ad wasn't ready yet.");
                }*/
            }
        });

        chapter11Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent12 = new Intent(v.getContext(), Chapter11.class);
                startActivity(intent12);

               /* if (mInterstitialAd != null) {
                    mInterstitialAd.show(getActivity());
                } else {
                    Log.d("---AdMob", "The interstitial ad wasn't ready yet.");
                }*/
            }
        });

        chapter12Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent13 = new Intent(v.getContext(), Chapter12.class);
                startActivity(intent13);

               /* if (mInterstitialAd != null) {
                    mInterstitialAd.show(getActivity());
                } else {
                    Log.d("---AdMob", "The interstitial ad wasn't ready yet.");
                }*/
            }
        });

        chapter13Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent14 = new Intent(v.getContext(), Chapter13.class);
                startActivity(intent14);

               /* if (mInterstitialAd != null) {
                    mInterstitialAd.show(getActivity());
                } else {
                    Log.d("---AdMob", "The interstitial ad wasn't ready yet.");
                }*/
            }
        });

        chapter14Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent16 = new Intent(v.getContext(), Chapter14.class);
                startActivity(intent16);

               /* if (mInterstitialAd != null) {
                    mInterstitialAd.show(getActivity());
                } else {
                    Log.d("---AdMob", "The interstitial ad wasn't ready yet.");
                }*/
            }
        });

        chapter15Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent17 = new Intent(v.getContext(), Chapter15.class);
                startActivity(intent17);

               /* if (mInterstitialAd != null) {
                    mInterstitialAd.show(getActivity());
                } else {
                    Log.d("---AdMob", "The interstitial ad wasn't ready yet.");
                }*/
            }
        });

        chapter16Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent18 = new Intent(v.getContext(), Chapter16.class);
                startActivity(intent18);

               /* if (mInterstitialAd != null) {
                    mInterstitialAd.show(getActivity());
                } else {
                    Log.d("---AdMob", "The interstitial ad wasn't ready yet.");
                }*/
            }
        });

        chapter17Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent19 = new Intent(v.getContext(), Chapter17.class);
                startActivity(intent19);

               /* if (mInterstitialAd != null) {
                    mInterstitialAd.show(getActivity());
                } else {
                    Log.d("---AdMob", "The interstitial ad wasn't ready yet.");
                }*/
            }
        });

        chapter18Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent20 = new Intent(v.getContext(), Chapter18.class);
                startActivity(intent20);

               /* if (mInterstitialAd != null) {
                    mInterstitialAd.show(getActivity());
                } else {
                    Log.d("---AdMob", "The interstitial ad wasn't ready yet.");
                }*/
            }
        });

        chapter19Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent21 = new Intent(v.getContext(), Chapter19.class);
                startActivity(intent21);

               /* if (mInterstitialAd != null) {
                    mInterstitialAd.show(getActivity());
                } else {
                    Log.d("---AdMob", "The interstitial ad wasn't ready yet.");
                }*/
            }
        });

        chapter20Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent23 = new Intent(v.getContext(), Chapter20.class);
                startActivity(intent23);

               /* if (mInterstitialAd != null) {
                    mInterstitialAd.show(getActivity());
                } else {
                    Log.d("---AdMob", "The interstitial ad wasn't ready yet.");
                }*/
            }
        });

        chapter21Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent24 = new Intent(v.getContext(), Chapter21.class);
                startActivity(intent24);

               /* if (mInterstitialAd != null) {
                    mInterstitialAd.show(getActivity());
                } else {
                    Log.d("---AdMob", "The interstitial ad wasn't ready yet.");
                }*/
            }
        });

        chapter22Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent25 = new Intent(v.getContext(), Chapter22.class);
                startActivity(intent25);

               /* if (mInterstitialAd != null) {
                    mInterstitialAd.show(getActivity());
                } else {
                    Log.d("---AdMob", "The interstitial ad wasn't ready yet.");
                }*/
            }
        });

        chapter23Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent26 = new Intent(v.getContext(), Chapter23.class);
                startActivity(intent26);

               /* if (mInterstitialAd != null) {
                    mInterstitialAd.show(getActivity());
                } else {
                    Log.d("---AdMob", "The interstitial ad wasn't ready yet.");
                }*/
            }
        });

        chapter24Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent27 = new Intent(v.getContext(), Chapter24.class);
                startActivity(intent27);

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

//            @Override
//            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
//                // Handle the error
//                Log.i("---AdMob", loadAdError.getMessage());
//                mInterstitialAd = null;
//            }
//        });
//    }
}
