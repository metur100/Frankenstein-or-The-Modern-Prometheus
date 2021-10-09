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

        Button ademsButton = (Button) view.findViewById(R.id.ademsbutton);
        Button idrissButton = (Button) view.findViewById(R.id.idrissbutton);
        Button nuhButton = (Button) view.findViewById(R.id.nuhbuttton);
        Button hudButton = (Button) view.findViewById(R.id.hudbutton);
        Button selihButton = (Button) view.findViewById(R.id.salihbutton);
        Button ibrahimButton = (Button) view.findViewById(R.id.ibrahimbutton);
        Button ismailButton = (Button) view.findViewById(R.id.ismailbutton);
        Button lutButton = (Button) view.findViewById(R.id.lutbutton);
        Button ishakButton = (Button) view.findViewById(R.id.ishakbutton);
        Button jusufButton = (Button) view.findViewById(R.id.jusufbutton);
        Button ejubButton = (Button) view.findViewById(R.id.ejubbutton);
        Button suajbButton = (Button) view.findViewById(R.id.suajbbutton);
        Button musaButton = (Button) view.findViewById(R.id.musabutton);
        Button zulkiflButton = (Button) view.findViewById(R.id.zulkiflbutton);
        Button davudButton = (Button) view.findViewById(R.id.davudbutton);
        Button sulejmanButton = (Button) view.findViewById(R.id.sulejmanbutton);
        Button ilijasButton = (Button) view.findViewById(R.id.ilijasbutton);
        Button eljeseButton = (Button) view.findViewById(R.id.eljesebutton);
        Button junusButton = (Button) view.findViewById(R.id.junusbutton);
        Button jahjaButton = (Button) view.findViewById(R.id.jahjaizekerijjabutton);
        Button isaButton = (Button) view.findViewById(R.id.isabutton);
        Button danijalButton = (Button) view.findViewById(R.id.danijalbutton);
        Button eremijaButton = (Button) view.findViewById(R.id.eremijabutton);
        Button hezekijelButton = (Button) view.findViewById(R.id.hezekijelbutton);
        Button hidrButton = (Button) view.findViewById(R.id.hidrbutton);
        Button josuaButton = (Button) view.findViewById(R.id.josuabutton);
        Button samuelButton = (Button) view.findViewById(R.id.samuelbutton);

        ademsButton.setOnClickListener(new OnClickListener() {
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

        idrissButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(v.getContext(), IdrisText.class);
                startActivity(intent2);

               /* if (mInterstitialAd != null) {
                    mInterstitialAd.show(getActivity());
                } else {
                    Log.d("---AdMob", "The interstitial ad wasn't ready yet.");
                }*/
            }
        });

        nuhButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(v.getContext(), NuhText.class);
                startActivity(intent3);

               /* if (mInterstitialAd != null) {
                    mInterstitialAd.show(getActivity());
                } else {
                    Log.d("---AdMob", "The interstitial ad wasn't ready yet.");
                }*/
            }
        });

        hudButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(v.getContext(), HudText.class);
                startActivity(intent4);

               /* if (mInterstitialAd != null) {
                    mInterstitialAd.show(getActivity());
                } else {
                    Log.d("---AdMob", "The interstitial ad wasn't ready yet.");
                }*/
            }
        });

        selihButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(v.getContext(), SalihText.class);
                startActivity(intent5);

               /* if (mInterstitialAd != null) {
                    mInterstitialAd.show(getActivity());
                } else {
                    Log.d("---AdMob", "The interstitial ad wasn't ready yet.");
                }*/
            }
        });

        ibrahimButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6 = new Intent(v.getContext(), IbrahimText.class);
                startActivity(intent6);

               /* if (mInterstitialAd != null) {
                    mInterstitialAd.show(getActivity());
                } else {
                    Log.d("---AdMob", "The interstitial ad wasn't ready yet.");
                }*/
            }
        });

        ismailButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent7 = new Intent(v.getContext(), IsmailText.class);
                startActivity(intent7);

               /* if (mInterstitialAd != null) {
                    mInterstitialAd.show(getActivity());
                } else {
                    Log.d("---AdMob", "The interstitial ad wasn't ready yet.");
                }*/
            }
        });

        lutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent8 = new Intent(v.getContext(), LutText.class);
                startActivity(intent8);

               /* if (mInterstitialAd != null) {
                    mInterstitialAd.show(getActivity());
                } else {
                    Log.d("---AdMob", "The interstitial ad wasn't ready yet.");
                }*/
            }
        });

        ishakButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent9 = new Intent(v.getContext(), IshakText.class);
                startActivity(intent9);

               /* if (mInterstitialAd != null) {
                    mInterstitialAd.show(getActivity());
                } else {
                    Log.d("---AdMob", "The interstitial ad wasn't ready yet.");
                }*/
            }
        });

        jusufButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent11 = new Intent(v.getContext(), JusufText.class);
                startActivity(intent11);

               /* if (mInterstitialAd != null) {
                    mInterstitialAd.show(getActivity());
                } else {
                    Log.d("---AdMob", "The interstitial ad wasn't ready yet.");
                }*/
            }
        });

        ejubButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent12 = new Intent(v.getContext(), EjubText.class);
                startActivity(intent12);

               /* if (mInterstitialAd != null) {
                    mInterstitialAd.show(getActivity());
                } else {
                    Log.d("---AdMob", "The interstitial ad wasn't ready yet.");
                }*/
            }
        });

        suajbButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent13 = new Intent(v.getContext(), SuajbText.class);
                startActivity(intent13);

               /* if (mInterstitialAd != null) {
                    mInterstitialAd.show(getActivity());
                } else {
                    Log.d("---AdMob", "The interstitial ad wasn't ready yet.");
                }*/
            }
        });

        musaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent14 = new Intent(v.getContext(), MusaText.class);
                startActivity(intent14);

               /* if (mInterstitialAd != null) {
                    mInterstitialAd.show(getActivity());
                } else {
                    Log.d("---AdMob", "The interstitial ad wasn't ready yet.");
                }*/
            }
        });

        zulkiflButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent16 = new Intent(v.getContext(), ZulkiflText.class);
                startActivity(intent16);

               /* if (mInterstitialAd != null) {
                    mInterstitialAd.show(getActivity());
                } else {
                    Log.d("---AdMob", "The interstitial ad wasn't ready yet.");
                }*/
            }
        });

        davudButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent17 = new Intent(v.getContext(), DavudText.class);
                startActivity(intent17);

               /* if (mInterstitialAd != null) {
                    mInterstitialAd.show(getActivity());
                } else {
                    Log.d("---AdMob", "The interstitial ad wasn't ready yet.");
                }*/
            }
        });

        sulejmanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent18 = new Intent(v.getContext(), SulejmanText.class);
                startActivity(intent18);

               /* if (mInterstitialAd != null) {
                    mInterstitialAd.show(getActivity());
                } else {
                    Log.d("---AdMob", "The interstitial ad wasn't ready yet.");
                }*/
            }
        });

        ilijasButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent19 = new Intent(v.getContext(), IlijasText.class);
                startActivity(intent19);

               /* if (mInterstitialAd != null) {
                    mInterstitialAd.show(getActivity());
                } else {
                    Log.d("---AdMob", "The interstitial ad wasn't ready yet.");
                }*/
            }
        });

        eljeseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent20 = new Intent(v.getContext(), EljeseText.class);
                startActivity(intent20);

               /* if (mInterstitialAd != null) {
                    mInterstitialAd.show(getActivity());
                } else {
                    Log.d("---AdMob", "The interstitial ad wasn't ready yet.");
                }*/
            }
        });

        junusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent21 = new Intent(v.getContext(), JunusText.class);
                startActivity(intent21);

               /* if (mInterstitialAd != null) {
                    mInterstitialAd.show(getActivity());
                } else {
                    Log.d("---AdMob", "The interstitial ad wasn't ready yet.");
                }*/
            }
        });

        jahjaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent23 = new Intent(v.getContext(), JahjaText.class);
                startActivity(intent23);

               /* if (mInterstitialAd != null) {
                    mInterstitialAd.show(getActivity());
                } else {
                    Log.d("---AdMob", "The interstitial ad wasn't ready yet.");
                }*/
            }
        });

        isaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent24 = new Intent(v.getContext(), IsaText.class);
                startActivity(intent24);

               /* if (mInterstitialAd != null) {
                    mInterstitialAd.show(getActivity());
                } else {
                    Log.d("---AdMob", "The interstitial ad wasn't ready yet.");
                }*/
            }
        });

        danijalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent25 = new Intent(v.getContext(), DanijalText.class);
                startActivity(intent25);

               /* if (mInterstitialAd != null) {
                    mInterstitialAd.show(getActivity());
                } else {
                    Log.d("---AdMob", "The interstitial ad wasn't ready yet.");
                }*/
            }
        });

        eremijaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent26 = new Intent(v.getContext(), EremijaText.class);
                startActivity(intent26);

               /* if (mInterstitialAd != null) {
                    mInterstitialAd.show(getActivity());
                } else {
                    Log.d("---AdMob", "The interstitial ad wasn't ready yet.");
                }*/
            }
        });

        hezekijelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent27 = new Intent(v.getContext(), HezekijelText.class);
                startActivity(intent27);

               /* if (mInterstitialAd != null) {
                    mInterstitialAd.show(getActivity());
                } else {
                    Log.d("---AdMob", "The interstitial ad wasn't ready yet.");
                }*/
            }
        });

        hidrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent28 = new Intent(v.getContext(), HidrText.class);
                startActivity(intent28);

               /* if (mInterstitialAd != null) {
                    mInterstitialAd.show(getActivity());
                } else {
                    Log.d("---AdMob", "The interstitial ad wasn't ready yet.");
                }*/
            }
        });

        josuaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent29 = new Intent(v.getContext(), JosuaText.class);
                startActivity(intent29);

               /* if (mInterstitialAd != null) {
                    mInterstitialAd.show(getActivity());
                } else {
                    Log.d("---AdMob", "The interstitial ad wasn't ready yet.");
                }*/
            }
        });

        samuelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent30 = new Intent(v.getContext(), SamuelText.class);
                startActivity(intent30);

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
