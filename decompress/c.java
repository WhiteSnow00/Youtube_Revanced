import android.content.res.TypedArray;
import android.animation.Animator;
import android.view.animation.Animation;
import android.view.ViewGroup;
import android.animation.AnimatorInflater;
import android.content.res.Resources$NotFoundException;
import android.view.animation.AnimationUtils;
import android.content.Context;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import android.os.Parcel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class c
{
    public static String a(final int n) {
        switch (n) {
            default: {
                return "null";
            }
            case 6: {
                return "SELECTORDINAL";
            }
            case 5: {
                return "SELECT";
            }
            case 4: {
                return "PLURAL";
            }
            case 3: {
                return "CHOICE";
            }
            case 2: {
                return "SIMPLE";
            }
            case 1: {
                return "NONE";
            }
        }
    }
    
    public static boolean b(final int n) {
        return n == 4 || n == 6;
    }
    
    public static final ahgz c(int n) {
        if (--n == 0) {
            final ahcr a = ahgz.a();
            a.ax(2);
            return (ahgz)a.build();
        }
        if (n == 1) {
            final ahcr a2 = ahgz.a();
            a2.ax(2);
            return (ahgz)a2.build();
        }
        if (n == 2) {
            final ahcr a3 = ahgz.a();
            a3.ax(2);
            return (ahgz)a3.build();
        }
        if (n == 3) {
            final ahcr a4 = ahgz.a();
            a4.ax(1);
            return (ahgz)a4.build();
        }
        switch (n) {
            default: {
                switch (n) {
                    default: {
                        switch (n) {
                            default: {
                                switch (n) {
                                    default: {
                                        switch (n) {
                                            default: {
                                                switch (n) {
                                                    default: {
                                                        final ahcr a5 = ahgz.a();
                                                        a5.ax(1);
                                                        return (ahgz)a5.build();
                                                    }
                                                    case 403: {
                                                        final ahcr a6 = ahgz.a();
                                                        a6.ax(2);
                                                        return (ahgz)a6.build();
                                                    }
                                                    case 402: {
                                                        final ahcr a7 = ahgz.a();
                                                        final ahcr a8 = ahgx.a();
                                                        a8.as(71);
                                                        final ahcr a9 = ahgy.a();
                                                        a9.au(73);
                                                        a9.au(72);
                                                        a8.ar((ahgy)a9.build());
                                                        a7.av((ahgx)a8.build());
                                                        return (ahgz)a7.build();
                                                    }
                                                    case 401: {
                                                        final ahcr a10 = ahgz.a();
                                                        final ahcr a11 = ahgx.a();
                                                        a11.as(71);
                                                        a11.as(74);
                                                        final ahcr a12 = ahgy.a();
                                                        a12.au(73);
                                                        a12.au(72);
                                                        a11.ar((ahgy)a12.build());
                                                        a10.av((ahgx)a11.build());
                                                        return (ahgz)a10.build();
                                                    }
                                                    case 400: {
                                                        final ahcr a13 = ahgz.a();
                                                        a13.ax(57);
                                                        return (ahgz)a13.build();
                                                    }
                                                    case 399: {
                                                        final ahcr a14 = ahgz.a();
                                                        a14.ax(57);
                                                        return (ahgz)a14.build();
                                                    }
                                                    case 398: {
                                                        final ahcr a15 = ahgz.a();
                                                        final ahcr a16 = ahgy.a();
                                                        a16.au(59);
                                                        a16.au(58);
                                                        a15.aw((ahgy)a16.build());
                                                        return (ahgz)a15.build();
                                                    }
                                                    case 397: {
                                                        final ahcr a17 = ahgz.a();
                                                        a17.ax(59);
                                                        return (ahgz)a17.build();
                                                    }
                                                    case 396: {
                                                        final ahcr a18 = ahgz.a();
                                                        final ahcr a19 = ahgy.a();
                                                        a19.au(59);
                                                        a19.au(58);
                                                        a18.aw((ahgy)a19.build());
                                                        return (ahgz)a18.build();
                                                    }
                                                    case 395: {
                                                        final ahcr a20 = ahgz.a();
                                                        a20.ax(60);
                                                        return (ahgz)a20.build();
                                                    }
                                                    case 394: {
                                                        final ahcr a21 = ahgz.a();
                                                        a21.ax(60);
                                                        return (ahgz)a21.build();
                                                    }
                                                    case 393: {
                                                        final ahcr a22 = ahgz.a();
                                                        a22.ax(61);
                                                        return (ahgz)a22.build();
                                                    }
                                                    case 392: {
                                                        final ahcr a23 = ahgz.a();
                                                        a23.ax(61);
                                                        return (ahgz)a23.build();
                                                    }
                                                    case 391: {
                                                        final ahcr a24 = ahgz.a();
                                                        a24.ax(62);
                                                        return (ahgz)a24.build();
                                                    }
                                                    case 390: {
                                                        final ahcr a25 = ahgz.a();
                                                        a25.ax(62);
                                                        return (ahgz)a25.build();
                                                    }
                                                    case 389: {
                                                        final ahcr a26 = ahgz.a();
                                                        a26.ax(62);
                                                        return (ahgz)a26.build();
                                                    }
                                                    case 388: {
                                                        final ahcr a27 = ahgz.a();
                                                        a27.ax(63);
                                                        return (ahgz)a27.build();
                                                    }
                                                    case 387: {
                                                        final ahcr a28 = ahgz.a();
                                                        a28.ax(63);
                                                        return (ahgz)a28.build();
                                                    }
                                                    case 386: {
                                                        final ahcr a29 = ahgz.a();
                                                        a29.ax(64);
                                                        return (ahgz)a29.build();
                                                    }
                                                    case 385: {
                                                        final ahcr a30 = ahgz.a();
                                                        a30.ax(64);
                                                        return (ahgz)a30.build();
                                                    }
                                                    case 384: {
                                                        final ahcr a31 = ahgz.a();
                                                        a31.ax(64);
                                                        return (ahgz)a31.build();
                                                    }
                                                    case 383: {
                                                        final ahcr a32 = ahgz.a();
                                                        final ahcr a33 = ahgy.a();
                                                        a33.au(65);
                                                        a33.au(66);
                                                        a32.aw((ahgy)a33.build());
                                                        return (ahgz)a32.build();
                                                    }
                                                    case 382: {
                                                        final ahcr a34 = ahgz.a();
                                                        final ahcr a35 = ahgy.a();
                                                        a35.au(65);
                                                        a35.au(66);
                                                        a34.aw((ahgy)a35.build());
                                                        return (ahgz)a34.build();
                                                    }
                                                    case 381: {
                                                        final ahcr a36 = ahgz.a();
                                                        a36.ax(65);
                                                        return (ahgz)a36.build();
                                                    }
                                                    case 380: {
                                                        final ahcr a37 = ahgz.a();
                                                        a37.ax(66);
                                                        return (ahgz)a37.build();
                                                    }
                                                    case 379: {
                                                        final ahcr a38 = ahgz.a();
                                                        a38.ax(66);
                                                        return (ahgz)a38.build();
                                                    }
                                                    case 378: {
                                                        final ahcr a39 = ahgz.a();
                                                        a39.ax(67);
                                                        return (ahgz)a39.build();
                                                    }
                                                    case 377: {
                                                        final ahcr a40 = ahgz.a();
                                                        a40.ax(67);
                                                        return (ahgz)a40.build();
                                                    }
                                                    case 376: {
                                                        final ahcr a41 = ahgz.a();
                                                        a41.ax(68);
                                                        return (ahgz)a41.build();
                                                    }
                                                    case 375: {
                                                        final ahcr a42 = ahgz.a();
                                                        a42.ax(68);
                                                        return (ahgz)a42.build();
                                                    }
                                                    case 374: {
                                                        final ahcr a43 = ahgz.a();
                                                        a43.ax(69);
                                                        return (ahgz)a43.build();
                                                    }
                                                    case 373: {
                                                        final ahcr a44 = ahgz.a();
                                                        a44.ax(69);
                                                        return (ahgz)a44.build();
                                                    }
                                                    case 372: {
                                                        final ahcr a45 = ahgz.a();
                                                        a45.ax(70);
                                                        return (ahgz)a45.build();
                                                    }
                                                    case 371: {
                                                        final ahcr a46 = ahgz.a();
                                                        a46.ax(70);
                                                        return (ahgz)a46.build();
                                                    }
                                                    case 370: {
                                                        final ahcr a47 = ahgz.a();
                                                        a47.ax(70);
                                                        return (ahgz)a47.build();
                                                    }
                                                    case 369: {
                                                        final ahcr a48 = ahgz.a();
                                                        a48.ax(2);
                                                        return (ahgz)a48.build();
                                                    }
                                                }
                                                break;
                                            }
                                            case 367: {
                                                final ahcr a49 = ahgz.a();
                                                a49.ax(1);
                                                return (ahgz)a49.build();
                                            }
                                            case 366: {
                                                final ahcr a50 = ahgz.a();
                                                a50.ax(2);
                                                return (ahgz)a50.build();
                                            }
                                            case 365: {
                                                final ahcr a51 = ahgz.a();
                                                a51.ax(2);
                                                return (ahgz)a51.build();
                                            }
                                            case 364: {
                                                final ahcr a52 = ahgz.a();
                                                a52.ax(2);
                                                return (ahgz)a52.build();
                                            }
                                            case 363: {
                                                final ahcr a53 = ahgz.a();
                                                a53.ax(56);
                                                return (ahgz)a53.build();
                                            }
                                            case 362: {
                                                final ahcr a54 = ahgz.a();
                                                a54.ax(56);
                                                return (ahgz)a54.build();
                                            }
                                            case 361: {
                                                final ahcr a55 = ahgz.a();
                                                a55.ax(56);
                                                return (ahgz)a55.build();
                                            }
                                            case 360: {
                                                final ahcr a56 = ahgz.a();
                                                a56.ax(56);
                                                return (ahgz)a56.build();
                                            }
                                            case 359: {
                                                final ahcr a57 = ahgz.a();
                                                a57.ax(29);
                                                return (ahgz)a57.build();
                                            }
                                            case 358: {
                                                final ahcr a58 = ahgz.a();
                                                a58.ax(6);
                                                return (ahgz)a58.build();
                                            }
                                            case 357: {
                                                final ahcr a59 = ahgz.a();
                                                a59.ax(54);
                                                return (ahgz)a59.build();
                                            }
                                            case 356: {
                                                final ahcr a60 = ahgz.a();
                                                a60.ax(52);
                                                return (ahgz)a60.build();
                                            }
                                            case 355: {
                                                final ahcr a61 = ahgz.a();
                                                a61.ax(53);
                                                return (ahgz)a61.build();
                                            }
                                            case 354: {
                                                final ahcr a62 = ahgz.a();
                                                a62.ax(51);
                                                return (ahgz)a62.build();
                                            }
                                            case 353: {
                                                final ahcr a63 = ahgz.a();
                                                a63.ax(55);
                                                return (ahgz)a63.build();
                                            }
                                        }
                                        break;
                                    }
                                    case 345: {
                                        final ahcr a64 = ahgz.a();
                                        a64.ax(50);
                                        return (ahgz)a64.build();
                                    }
                                    case 344: {
                                        final ahcr a65 = ahgz.a();
                                        a65.ax(49);
                                        return (ahgz)a65.build();
                                    }
                                    case 343: {
                                        final ahcr a66 = ahgz.a();
                                        a66.ax(48);
                                        return (ahgz)a66.build();
                                    }
                                    case 342: {
                                        final ahcr a67 = ahgz.a();
                                        a67.ax(47);
                                        return (ahgz)a67.build();
                                    }
                                    case 341: {
                                        final ahcr a68 = ahgz.a();
                                        a68.ax(47);
                                        return (ahgz)a68.build();
                                    }
                                    case 340: {
                                        final ahcr a69 = ahgz.a();
                                        a69.ax(2);
                                        return (ahgz)a69.build();
                                    }
                                    case 339: {
                                        final ahcr a70 = ahgz.a();
                                        a70.ax(1);
                                        return (ahgz)a70.build();
                                    }
                                    case 338: {
                                        final ahcr a71 = ahgz.a();
                                        a71.ax(1);
                                        return (ahgz)a71.build();
                                    }
                                    case 337: {
                                        final ahcr a72 = ahgz.a();
                                        a72.ax(1);
                                        return (ahgz)a72.build();
                                    }
                                    case 336: {
                                        final ahcr a73 = ahgz.a();
                                        a73.ax(1);
                                        return (ahgz)a73.build();
                                    }
                                    case 335: {
                                        final ahcr a74 = ahgz.a();
                                        a74.ax(1);
                                        return (ahgz)a74.build();
                                    }
                                    case 334: {
                                        final ahcr a75 = ahgz.a();
                                        a75.ax(46);
                                        return (ahgz)a75.build();
                                    }
                                    case 333: {
                                        final ahcr a76 = ahgz.a();
                                        a76.ax(2);
                                        return (ahgz)a76.build();
                                    }
                                    case 332: {
                                        final ahcr a77 = ahgz.a();
                                        a77.ax(45);
                                        return (ahgz)a77.build();
                                    }
                                    case 331: {
                                        final ahcr a78 = ahgz.a();
                                        a78.ax(44);
                                        return (ahgz)a78.build();
                                    }
                                    case 330: {
                                        final ahcr a79 = ahgz.a();
                                        a79.ax(2);
                                        return (ahgz)a79.build();
                                    }
                                    case 329: {
                                        final ahcr a80 = ahgz.a();
                                        a80.ax(43);
                                        return (ahgz)a80.build();
                                    }
                                    case 328: {
                                        final ahcr a81 = ahgz.a();
                                        a81.ax(42);
                                        return (ahgz)a81.build();
                                    }
                                    case 327: {
                                        final ahcr a82 = ahgz.a();
                                        a82.ax(2);
                                        return (ahgz)a82.build();
                                    }
                                    case 326: {
                                        final ahcr a83 = ahgz.a();
                                        a83.ax(2);
                                        return (ahgz)a83.build();
                                    }
                                    case 325: {
                                        final ahcr a84 = ahgz.a();
                                        a84.ax(41);
                                        return (ahgz)a84.build();
                                    }
                                    case 324: {
                                        final ahcr a85 = ahgz.a();
                                        a85.ax(41);
                                        return (ahgz)a85.build();
                                    }
                                    case 323: {
                                        final ahcr a86 = ahgz.a();
                                        a86.ax(41);
                                        return (ahgz)a86.build();
                                    }
                                    case 322: {
                                        final ahcr a87 = ahgz.a();
                                        a87.ax(41);
                                        return (ahgz)a87.build();
                                    }
                                    case 321: {
                                        final ahcr a88 = ahgz.a();
                                        a88.ax(2);
                                        return (ahgz)a88.build();
                                    }
                                    case 320: {
                                        final ahcr a89 = ahgz.a();
                                        a89.ax(40);
                                        return (ahgz)a89.build();
                                    }
                                    case 319: {
                                        final ahcr a90 = ahgz.a();
                                        a90.ax(6);
                                        return (ahgz)a90.build();
                                    }
                                    case 318: {
                                        final ahcr a91 = ahgz.a();
                                        a91.ax(21);
                                        return (ahgz)a91.build();
                                    }
                                    case 317: {
                                        final ahcr a92 = ahgz.a();
                                        a92.ax(2);
                                        return (ahgz)a92.build();
                                    }
                                    case 316: {
                                        final ahcr a93 = ahgz.a();
                                        a93.ax(2);
                                        return (ahgz)a93.build();
                                    }
                                    case 315: {
                                        final ahcr a94 = ahgz.a();
                                        a94.ax(42);
                                        return (ahgz)a94.build();
                                    }
                                    case 314: {
                                        final ahcr a95 = ahgz.a();
                                        a95.ax(42);
                                        return (ahgz)a95.build();
                                    }
                                    case 313: {
                                        final ahcr a96 = ahgz.a();
                                        a96.ax(29);
                                        return (ahgz)a96.build();
                                    }
                                    case 312: {
                                        final ahcr a97 = ahgz.a();
                                        a97.ax(38);
                                        return (ahgz)a97.build();
                                    }
                                    case 311: {
                                        final ahcr a98 = ahgz.a();
                                        a98.ax(2);
                                        return (ahgz)a98.build();
                                    }
                                    case 310: {
                                        final ahcr a99 = ahgz.a();
                                        a99.ax(2);
                                        return (ahgz)a99.build();
                                    }
                                    case 309: {
                                        final ahcr a100 = ahgz.a();
                                        a100.ax(39);
                                        return (ahgz)a100.build();
                                    }
                                    case 308: {
                                        final ahcr a101 = ahgz.a();
                                        a101.ax(2);
                                        return (ahgz)a101.build();
                                    }
                                    case 307: {
                                        final ahcr a102 = ahgz.a();
                                        a102.ax(2);
                                        return (ahgz)a102.build();
                                    }
                                    case 306: {
                                        final ahcr a103 = ahgz.a();
                                        a103.ax(37);
                                        return (ahgz)a103.build();
                                    }
                                    case 305: {
                                        final ahcr a104 = ahgz.a();
                                        a104.ax(2);
                                        return (ahgz)a104.build();
                                    }
                                    case 304: {
                                        final ahcr a105 = ahgz.a();
                                        a105.ax(2);
                                        return (ahgz)a105.build();
                                    }
                                    case 303: {
                                        final ahcr a106 = ahgz.a();
                                        a106.ax(2);
                                        return (ahgz)a106.build();
                                    }
                                    case 302: {
                                        final ahcr a107 = ahgz.a();
                                        a107.ax(2);
                                        return (ahgz)a107.build();
                                    }
                                    case 301: {
                                        final ahcr a108 = ahgz.a();
                                        a108.ax(36);
                                        return (ahgz)a108.build();
                                    }
                                    case 300: {
                                        final ahcr a109 = ahgz.a();
                                        a109.ax(36);
                                        return (ahgz)a109.build();
                                    }
                                    case 299: {
                                        final ahcr a110 = ahgz.a();
                                        a110.ax(36);
                                        return (ahgz)a110.build();
                                    }
                                    case 298: {
                                        final ahcr a111 = ahgz.a();
                                        a111.ax(36);
                                        return (ahgz)a111.build();
                                    }
                                    case 297: {
                                        final ahcr a112 = ahgz.a();
                                        a112.ax(35);
                                        return (ahgz)a112.build();
                                    }
                                    case 296: {
                                        final ahcr a113 = ahgz.a();
                                        a113.ax(35);
                                        return (ahgz)a113.build();
                                    }
                                    case 295: {
                                        final ahcr a114 = ahgz.a();
                                        a114.ax(35);
                                        return (ahgz)a114.build();
                                    }
                                    case 294: {
                                        final ahcr a115 = ahgz.a();
                                        a115.ax(35);
                                        return (ahgz)a115.build();
                                    }
                                    case 293: {
                                        final ahcr a116 = ahgz.a();
                                        a116.ax(34);
                                        return (ahgz)a116.build();
                                    }
                                    case 292: {
                                        final ahcr a117 = ahgz.a();
                                        a117.ax(34);
                                        return (ahgz)a117.build();
                                    }
                                    case 291: {
                                        final ahcr a118 = ahgz.a();
                                        a118.ax(34);
                                        return (ahgz)a118.build();
                                    }
                                    case 290: {
                                        final ahcr a119 = ahgz.a();
                                        a119.ax(34);
                                        return (ahgz)a119.build();
                                    }
                                    case 289: {
                                        final ahcr a120 = ahgz.a();
                                        a120.ax(2);
                                        return (ahgz)a120.build();
                                    }
                                    case 288: {
                                        final ahcr a121 = ahgz.a();
                                        a121.ax(22);
                                        return (ahgz)a121.build();
                                    }
                                    case 287: {
                                        final ahcr a122 = ahgz.a();
                                        a122.ax(2);
                                        return (ahgz)a122.build();
                                    }
                                    case 286: {
                                        final ahcr a123 = ahgz.a();
                                        a123.ax(2);
                                        return (ahgz)a123.build();
                                    }
                                    case 285: {
                                        final ahcr a124 = ahgz.a();
                                        a124.ax(2);
                                        return (ahgz)a124.build();
                                    }
                                    case 284: {
                                        final ahcr a125 = ahgz.a();
                                        a125.ax(33);
                                        return (ahgz)a125.build();
                                    }
                                    case 283: {
                                        final ahcr a126 = ahgz.a();
                                        a126.ax(32);
                                        return (ahgz)a126.build();
                                    }
                                    case 282: {
                                        final ahcr a127 = ahgz.a();
                                        a127.ax(32);
                                        return (ahgz)a127.build();
                                    }
                                    case 281: {
                                        final ahcr a128 = ahgz.a();
                                        a128.ax(32);
                                        return (ahgz)a128.build();
                                    }
                                    case 280: {
                                        final ahcr a129 = ahgz.a();
                                        a129.ax(2);
                                        return (ahgz)a129.build();
                                    }
                                    case 279: {
                                        final ahcr a130 = ahgz.a();
                                        a130.ax(2);
                                        return (ahgz)a130.build();
                                    }
                                    case 278: {
                                        final ahcr a131 = ahgz.a();
                                        a131.ax(5);
                                        return (ahgz)a131.build();
                                    }
                                    case 277: {
                                        final ahcr a132 = ahgz.a();
                                        a132.ax(5);
                                        return (ahgz)a132.build();
                                    }
                                    case 276: {
                                        final ahcr a133 = ahgz.a();
                                        a133.ax(31);
                                        return (ahgz)a133.build();
                                    }
                                    case 275: {
                                        final ahcr a134 = ahgz.a();
                                        a134.ax(2);
                                        return (ahgz)a134.build();
                                    }
                                    case 274: {
                                        final ahcr a135 = ahgz.a();
                                        a135.ax(2);
                                        return (ahgz)a135.build();
                                    }
                                    case 273: {
                                        final ahcr a136 = ahgz.a();
                                        a136.ax(2);
                                        return (ahgz)a136.build();
                                    }
                                    case 272: {
                                        final ahcr a137 = ahgz.a();
                                        a137.ax(2);
                                        return (ahgz)a137.build();
                                    }
                                    case 271: {
                                        final ahcr a138 = ahgz.a();
                                        a138.ax(2);
                                        return (ahgz)a138.build();
                                    }
                                    case 270: {
                                        final ahcr a139 = ahgz.a();
                                        a139.ax(2);
                                        return (ahgz)a139.build();
                                    }
                                    case 269: {
                                        final ahcr a140 = ahgz.a();
                                        a140.ax(2);
                                        return (ahgz)a140.build();
                                    }
                                    case 268: {
                                        final ahcr a141 = ahgz.a();
                                        a141.ax(5);
                                        return (ahgz)a141.build();
                                    }
                                    case 267: {
                                        final ahcr a142 = ahgz.a();
                                        a142.ax(2);
                                        return (ahgz)a142.build();
                                    }
                                    case 266: {
                                        final ahcr a143 = ahgz.a();
                                        a143.ax(22);
                                        return (ahgz)a143.build();
                                    }
                                    case 265: {
                                        final ahcr a144 = ahgz.a();
                                        a144.ax(22);
                                        return (ahgz)a144.build();
                                    }
                                    case 264: {
                                        final ahcr a145 = ahgz.a();
                                        a145.ax(2);
                                        return (ahgz)a145.build();
                                    }
                                    case 263: {
                                        final ahcr a146 = ahgz.a();
                                        a146.ax(2);
                                        return (ahgz)a146.build();
                                    }
                                    case 262: {
                                        final ahcr a147 = ahgz.a();
                                        a147.ax(18);
                                        return (ahgz)a147.build();
                                    }
                                    case 261: {
                                        final ahcr a148 = ahgz.a();
                                        a148.ax(2);
                                        return (ahgz)a148.build();
                                    }
                                    case 260: {
                                        final ahcr a149 = ahgz.a();
                                        a149.ax(2);
                                        return (ahgz)a149.build();
                                    }
                                    case 259: {
                                        final ahcr a150 = ahgz.a();
                                        a150.ax(29);
                                        return (ahgz)a150.build();
                                    }
                                    case 258: {
                                        final ahcr a151 = ahgz.a();
                                        a151.ax(29);
                                        return (ahgz)a151.build();
                                    }
                                    case 257: {
                                        final ahcr a152 = ahgz.a();
                                        a152.ax(29);
                                        return (ahgz)a152.build();
                                    }
                                    case 256: {
                                        final ahcr a153 = ahgz.a();
                                        a153.ax(28);
                                        return (ahgz)a153.build();
                                    }
                                    case 255: {
                                        final ahcr a154 = ahgz.a();
                                        a154.ax(2);
                                        return (ahgz)a154.build();
                                    }
                                    case 254: {
                                        final ahcr a155 = ahgz.a();
                                        a155.ax(4);
                                        return (ahgz)a155.build();
                                    }
                                    case 253: {
                                        final ahcr a156 = ahgz.a();
                                        a156.ax(4);
                                        return (ahgz)a156.build();
                                    }
                                    case 252: {
                                        final ahcr a157 = ahgz.a();
                                        a157.ax(4);
                                        return (ahgz)a157.build();
                                    }
                                    case 251: {
                                        final ahcr a158 = ahgz.a();
                                        a158.ax(2);
                                        return (ahgz)a158.build();
                                    }
                                    case 250: {
                                        final ahcr a159 = ahgz.a();
                                        a159.ax(2);
                                        return (ahgz)a159.build();
                                    }
                                }
                                break;
                            }
                            case 247: {
                                final ahcr a160 = ahgz.a();
                                a160.ax(2);
                                return (ahgz)a160.build();
                            }
                            case 246: {
                                final ahcr a161 = ahgz.a();
                                a161.ax(2);
                                return (ahgz)a161.build();
                            }
                            case 245: {
                                final ahcr a162 = ahgz.a();
                                a162.ax(2);
                                return (ahgz)a162.build();
                            }
                            case 244: {
                                final ahcr a163 = ahgz.a();
                                a163.ax(27);
                                return (ahgz)a163.build();
                            }
                            case 243: {
                                final ahcr a164 = ahgz.a();
                                a164.ax(2);
                                return (ahgz)a164.build();
                            }
                            case 242: {
                                final ahcr a165 = ahgz.a();
                                a165.ax(2);
                                return (ahgz)a165.build();
                            }
                            case 241: {
                                final ahcr a166 = ahgz.a();
                                a166.ax(2);
                                return (ahgz)a166.build();
                            }
                            case 240: {
                                final ahcr a167 = ahgz.a();
                                a167.ax(2);
                                return (ahgz)a167.build();
                            }
                            case 239: {
                                final ahcr a168 = ahgz.a();
                                a168.ax(4);
                                return (ahgz)a168.build();
                            }
                            case 238: {
                                final ahcr a169 = ahgz.a();
                                a169.ax(23);
                                return (ahgz)a169.build();
                            }
                            case 237: {
                                final ahcr a170 = ahgz.a();
                                a170.ax(21);
                                return (ahgz)a170.build();
                            }
                            case 236: {
                                final ahcr a171 = ahgz.a();
                                a171.ax(22);
                                return (ahgz)a171.build();
                            }
                            case 235: {
                                final ahcr a172 = ahgz.a();
                                a172.ax(22);
                                return (ahgz)a172.build();
                            }
                            case 234: {
                                final ahcr a173 = ahgz.a();
                                a173.ax(22);
                                return (ahgz)a173.build();
                            }
                            case 233: {
                                final ahcr a174 = ahgz.a();
                                a174.ax(20);
                                return (ahgz)a174.build();
                            }
                            case 232: {
                                final ahcr a175 = ahgz.a();
                                a175.ax(2);
                                return (ahgz)a175.build();
                            }
                            case 231: {
                                final ahcr a176 = ahgz.a();
                                a176.ax(2);
                                return (ahgz)a176.build();
                            }
                            case 230: {
                                final ahcr a177 = ahgz.a();
                                a177.ax(2);
                                return (ahgz)a177.build();
                            }
                            case 229: {
                                final ahcr a178 = ahgz.a();
                                a178.ax(2);
                                return (ahgz)a178.build();
                            }
                            case 228: {
                                final ahcr a179 = ahgz.a();
                                a179.ax(2);
                                return (ahgz)a179.build();
                            }
                            case 227: {
                                final ahcr a180 = ahgz.a();
                                a180.ax(18);
                                return (ahgz)a180.build();
                            }
                            case 226: {
                                final ahcr a181 = ahgz.a();
                                a181.ax(9);
                                return (ahgz)a181.build();
                            }
                            case 225: {
                                final ahcr a182 = ahgz.a();
                                a182.ax(18);
                                return (ahgz)a182.build();
                            }
                            case 224: {
                                final ahcr a183 = ahgz.a();
                                a183.ax(18);
                                return (ahgz)a183.build();
                            }
                            case 223: {
                                final ahcr a184 = ahgz.a();
                                a184.ax(1);
                                return (ahgz)a184.build();
                            }
                            case 222: {
                                final ahcr a185 = ahgz.a();
                                a185.ax(2);
                                return (ahgz)a185.build();
                            }
                        }
                        break;
                    }
                    case 220: {
                        final ahcr a186 = ahgz.a();
                        a186.ax(2);
                        return (ahgz)a186.build();
                    }
                    case 219: {
                        final ahcr a187 = ahgz.a();
                        a187.ax(2);
                        return (ahgz)a187.build();
                    }
                    case 218: {
                        final ahcr a188 = ahgz.a();
                        a188.ax(10);
                        return (ahgz)a188.build();
                    }
                    case 217: {
                        final ahcr a189 = ahgz.a();
                        a189.ax(4);
                        return (ahgz)a189.build();
                    }
                    case 216: {
                        final ahcr a190 = ahgz.a();
                        a190.ax(2);
                        return (ahgz)a190.build();
                    }
                    case 215: {
                        final ahcr a191 = ahgz.a();
                        a191.ax(17);
                        return (ahgz)a191.build();
                    }
                    case 214: {
                        final ahcr a192 = ahgz.a();
                        a192.ax(2);
                        return (ahgz)a192.build();
                    }
                    case 213: {
                        final ahcr a193 = ahgz.a();
                        a193.ax(2);
                        return (ahgz)a193.build();
                    }
                    case 212: {
                        final ahcr a194 = ahgz.a();
                        final ahcr a195 = ahgy.a();
                        a195.au(25);
                        a195.au(24);
                        a194.aw((ahgy)a195.build());
                        return (ahgz)a194.build();
                    }
                    case 211: {
                        final ahcr a196 = ahgz.a();
                        final ahcr a197 = ahgy.a();
                        a197.au(25);
                        a197.au(24);
                        a196.aw((ahgy)a197.build());
                        return (ahgz)a196.build();
                    }
                    case 210: {
                        final ahcr a198 = ahgz.a();
                        final ahcr a199 = ahgy.a();
                        a199.au(25);
                        a199.au(24);
                        a198.aw((ahgy)a199.build());
                        return (ahgz)a198.build();
                    }
                    case 209: {
                        final ahcr a200 = ahgz.a();
                        a200.ax(2);
                        return (ahgz)a200.build();
                    }
                    case 208: {
                        final ahcr a201 = ahgz.a();
                        a201.ax(3);
                        return (ahgz)a201.build();
                    }
                    case 207: {
                        final ahcr a202 = ahgz.a();
                        a202.ax(2);
                        return (ahgz)a202.build();
                    }
                    case 206: {
                        final ahcr a203 = ahgz.a();
                        a203.ax(2);
                        return (ahgz)a203.build();
                    }
                    case 205: {
                        final ahcr a204 = ahgz.a();
                        a204.ax(2);
                        return (ahgz)a204.build();
                    }
                    case 204: {
                        final ahcr a205 = ahgz.a();
                        a205.ax(14);
                        return (ahgz)a205.build();
                    }
                    case 203: {
                        final ahcr a206 = ahgz.a();
                        a206.ax(2);
                        return (ahgz)a206.build();
                    }
                    case 202: {
                        final ahcr a207 = ahgz.a();
                        a207.ax(2);
                        return (ahgz)a207.build();
                    }
                    case 201: {
                        final ahcr a208 = ahgz.a();
                        a208.ax(2);
                        return (ahgz)a208.build();
                    }
                    case 200: {
                        final ahcr a209 = ahgz.a();
                        a209.ax(2);
                        return (ahgz)a209.build();
                    }
                    case 199: {
                        final ahcr a210 = ahgz.a();
                        a210.ax(2);
                        return (ahgz)a210.build();
                    }
                }
                break;
            }
            case 197: {
                final ahcr a211 = ahgz.a();
                a211.ax(13);
                return (ahgz)a211.build();
            }
            case 196: {
                final ahcr a212 = ahgz.a();
                a212.ax(3);
                return (ahgz)a212.build();
            }
            case 195: {
                final ahcr a213 = ahgz.a();
                a213.ax(26);
                return (ahgz)a213.build();
            }
            case 194: {
                final ahcr a214 = ahgz.a();
                a214.ax(2);
                return (ahgz)a214.build();
            }
            case 193: {
                final ahcr a215 = ahgz.a();
                a215.ax(2);
                return (ahgz)a215.build();
            }
            case 192: {
                final ahcr a216 = ahgz.a();
                a216.ax(2);
                return (ahgz)a216.build();
            }
            case 191: {
                final ahcr a217 = ahgz.a();
                final ahcr a218 = ahgy.a();
                a218.au(3);
                a218.au(15);
                a217.aw((ahgy)a218.build());
                return (ahgz)a217.build();
            }
            case 190: {
                final ahcr a219 = ahgz.a();
                final ahcr a220 = ahgy.a();
                a220.au(3);
                a220.au(15);
                a219.aw((ahgy)a220.build());
                return (ahgz)a219.build();
            }
            case 189: {
                final ahcr a221 = ahgz.a();
                final ahcr a222 = ahgy.a();
                a222.au(3);
                a222.au(15);
                a221.aw((ahgy)a222.build());
                return (ahgz)a221.build();
            }
            case 188: {
                final ahcr a223 = ahgz.a();
                final ahcr a224 = ahgy.a();
                a224.au(3);
                a224.au(15);
                a223.aw((ahgy)a224.build());
                return (ahgz)a223.build();
            }
            case 187: {
                final ahcr a225 = ahgz.a();
                final ahcr a226 = ahgy.a();
                a226.au(19);
                final ahcr a227 = ahgx.a();
                a227.as(9);
                a227.as(8);
                a226.at((ahgx)a227.build());
                a225.aw((ahgy)a226.build());
                return (ahgz)a225.build();
            }
            case 186: {
                final ahcr a228 = ahgz.a();
                final ahcr a229 = ahgx.a();
                a229.as(6);
                a229.as(9);
                final ahcr a230 = ahgy.a();
                a230.au(10);
                a230.au(11);
                a229.ar((ahgy)a230.build());
                a228.av((ahgx)a229.build());
                return (ahgz)a228.build();
            }
            case 185: {
                final ahcr a231 = ahgz.a();
                a231.ax(9);
                return (ahgz)a231.build();
            }
            case 184: {
                final ahcr a232 = ahgz.a();
                a232.ax(2);
                return (ahgz)a232.build();
            }
            case 183: {
                final ahcr a233 = ahgz.a();
                a233.ax(8);
                return (ahgz)a233.build();
            }
            case 182: {
                final ahcr a234 = ahgz.a();
                a234.ax(6);
                return (ahgz)a234.build();
            }
            case 181: {
                final ahcr a235 = ahgz.a();
                a235.ax(21);
                return (ahgz)a235.build();
            }
            case 180: {
                final ahcr a236 = ahgz.a();
                a236.ax(15);
                return (ahgz)a236.build();
            }
            case 179: {
                final ahcr a237 = ahgz.a();
                a237.ax(15);
                return (ahgz)a237.build();
            }
            case 178: {
                final ahcr a238 = ahgz.a();
                a238.ax(15);
                return (ahgz)a238.build();
            }
            case 177: {
                final ahcr a239 = ahgz.a();
                a239.ax(15);
                return (ahgz)a239.build();
            }
            case 176: {
                final ahcr a240 = ahgz.a();
                a240.ax(3);
                return (ahgz)a240.build();
            }
            case 175: {
                final ahcr a241 = ahgz.a();
                a241.ax(3);
                return (ahgz)a241.build();
            }
            case 174: {
                final ahcr a242 = ahgz.a();
                a242.ax(3);
                return (ahgz)a242.build();
            }
            case 173: {
                final ahcr a243 = ahgz.a();
                a243.ax(3);
                return (ahgz)a243.build();
            }
            case 172: {
                final ahcr a244 = ahgz.a();
                a244.ax(3);
                return (ahgz)a244.build();
            }
            case 171: {
                final ahcr a245 = ahgz.a();
                a245.ax(21);
                return (ahgz)a245.build();
            }
            case 170: {
                final ahcr a246 = ahgz.a();
                a246.ax(21);
                return (ahgz)a246.build();
            }
            case 169: {
                final ahcr a247 = ahgz.a();
                a247.ax(21);
                return (ahgz)a247.build();
            }
            case 168: {
                final ahcr a248 = ahgz.a();
                a248.ax(21);
                return (ahgz)a248.build();
            }
            case 167: {
                final ahcr a249 = ahgz.a();
                a249.ax(2);
                return (ahgz)a249.build();
            }
            case 166: {
                final ahcr a250 = ahgz.a();
                a250.ax(5);
                return (ahgz)a250.build();
            }
            case 165: {
                final ahcr a251 = ahgz.a();
                a251.ax(2);
                return (ahgz)a251.build();
            }
            case 164: {
                final ahcr a252 = ahgz.a();
                final ahcr a253 = ahgx.a();
                a253.as(2);
                a253.as(16);
                a252.av((ahgx)a253.build());
                return (ahgz)a252.build();
            }
            case 163: {
                final ahcr a254 = ahgz.a();
                final ahcr a255 = ahgx.a();
                a255.as(2);
                a255.as(16);
                a254.av((ahgx)a255.build());
                return (ahgz)a254.build();
            }
            case 162: {
                final ahcr a256 = ahgz.a();
                final ahcr a257 = ahgx.a();
                a257.as(2);
                a257.as(16);
                a256.av((ahgx)a257.build());
                return (ahgz)a256.build();
            }
            case 161: {
                final ahcr a258 = ahgz.a();
                final ahcr a259 = ahgx.a();
                a259.as(2);
                a259.as(16);
                a258.av((ahgx)a259.build());
                return (ahgz)a258.build();
            }
            case 160: {
                final ahcr a260 = ahgz.a();
                a260.ax(2);
                return (ahgz)a260.build();
            }
            case 159: {
                final ahcr a261 = ahgz.a();
                a261.ax(2);
                return (ahgz)a261.build();
            }
            case 158: {
                final ahcr a262 = ahgz.a();
                a262.ax(2);
                return (ahgz)a262.build();
            }
            case 157: {
                final ahcr a263 = ahgz.a();
                a263.ax(23);
                return (ahgz)a263.build();
            }
            case 156: {
                final ahcr a264 = ahgz.a();
                a264.ax(3);
                return (ahgz)a264.build();
            }
            case 155: {
                final ahcr a265 = ahgz.a();
                a265.ax(3);
                return (ahgz)a265.build();
            }
            case 154: {
                final ahcr a266 = ahgz.a();
                a266.ax(3);
                return (ahgz)a266.build();
            }
            case 153: {
                final ahcr a267 = ahgz.a();
                a267.ax(3);
                return (ahgz)a267.build();
            }
            case 152: {
                final ahcr a268 = ahgz.a();
                a268.ax(3);
                return (ahgz)a268.build();
            }
            case 151: {
                final ahcr a269 = ahgz.a();
                a269.ax(3);
                return (ahgz)a269.build();
            }
            case 150: {
                final ahcr a270 = ahgz.a();
                a270.ax(3);
                return (ahgz)a270.build();
            }
            case 149: {
                final ahcr a271 = ahgz.a();
                a271.ax(2);
                return (ahgz)a271.build();
            }
            case 148: {
                final ahcr a272 = ahgz.a();
                a272.ax(2);
                return (ahgz)a272.build();
            }
            case 147: {
                final ahcr a273 = ahgz.a();
                a273.ax(2);
                return (ahgz)a273.build();
            }
            case 146: {
                final ahcr a274 = ahgz.a();
                a274.ax(2);
                return (ahgz)a274.build();
            }
            case 145: {
                final ahcr a275 = ahgz.a();
                a275.ax(2);
                return (ahgz)a275.build();
            }
            case 144: {
                final ahcr a276 = ahgz.a();
                a276.ax(2);
                return (ahgz)a276.build();
            }
            case 143: {
                final ahcr a277 = ahgz.a();
                a277.ax(2);
                return (ahgz)a277.build();
            }
            case 142: {
                final ahcr a278 = ahgz.a();
                a278.ax(2);
                return (ahgz)a278.build();
            }
            case 141: {
                final ahcr a279 = ahgz.a();
                a279.ax(2);
                return (ahgz)a279.build();
            }
            case 140: {
                final ahcr a280 = ahgz.a();
                a280.ax(2);
                return (ahgz)a280.build();
            }
            case 139: {
                final ahcr a281 = ahgz.a();
                a281.ax(2);
                return (ahgz)a281.build();
            }
            case 138: {
                final ahcr a282 = ahgz.a();
                a282.ax(2);
                return (ahgz)a282.build();
            }
            case 137: {
                final ahcr a283 = ahgz.a();
                a283.ax(2);
                return (ahgz)a283.build();
            }
            case 136: {
                final ahcr a284 = ahgz.a();
                a284.ax(2);
                return (ahgz)a284.build();
            }
            case 135: {
                final ahcr a285 = ahgz.a();
                a285.ax(2);
                return (ahgz)a285.build();
            }
            case 134: {
                final ahcr a286 = ahgz.a();
                a286.ax(3);
                return (ahgz)a286.build();
            }
            case 133: {
                final ahcr a287 = ahgz.a();
                a287.ax(3);
                return (ahgz)a287.build();
            }
            case 132: {
                final ahcr a288 = ahgz.a();
                a288.ax(3);
                return (ahgz)a288.build();
            }
            case 131: {
                final ahcr a289 = ahgz.a();
                a289.ax(3);
                return (ahgz)a289.build();
            }
            case 130: {
                final ahcr a290 = ahgz.a();
                a290.ax(3);
                return (ahgz)a290.build();
            }
            case 129: {
                final ahcr a291 = ahgz.a();
                a291.ax(3);
                return (ahgz)a291.build();
            }
            case 128: {
                final ahcr a292 = ahgz.a();
                a292.ax(3);
                return (ahgz)a292.build();
            }
            case 127: {
                final ahcr a293 = ahgz.a();
                a293.ax(3);
                return (ahgz)a293.build();
            }
            case 126: {
                final ahcr a294 = ahgz.a();
                a294.ax(3);
                return (ahgz)a294.build();
            }
            case 125: {
                final ahcr a295 = ahgz.a();
                a295.ax(3);
                return (ahgz)a295.build();
            }
            case 124: {
                final ahcr a296 = ahgz.a();
                a296.ax(3);
                return (ahgz)a296.build();
            }
            case 123: {
                final ahcr a297 = ahgz.a();
                a297.ax(3);
                return (ahgz)a297.build();
            }
            case 122: {
                final ahcr a298 = ahgz.a();
                a298.ax(3);
                return (ahgz)a298.build();
            }
            case 121: {
                final ahcr a299 = ahgz.a();
                a299.ax(3);
                return (ahgz)a299.build();
            }
            case 120: {
                final ahcr a300 = ahgz.a();
                a300.ax(3);
                return (ahgz)a300.build();
            }
            case 119: {
                final ahcr a301 = ahgz.a();
                a301.ax(3);
                return (ahgz)a301.build();
            }
            case 118: {
                final ahcr a302 = ahgz.a();
                a302.ax(3);
                return (ahgz)a302.build();
            }
            case 117: {
                final ahcr a303 = ahgz.a();
                a303.ax(3);
                return (ahgz)a303.build();
            }
            case 116: {
                final ahcr a304 = ahgz.a();
                a304.ax(3);
                return (ahgz)a304.build();
            }
            case 115: {
                final ahcr a305 = ahgz.a();
                a305.ax(3);
                return (ahgz)a305.build();
            }
            case 114: {
                final ahcr a306 = ahgz.a();
                a306.ax(2);
                return (ahgz)a306.build();
            }
            case 113: {
                final ahcr a307 = ahgz.a();
                a307.ax(3);
                return (ahgz)a307.build();
            }
            case 112: {
                final ahcr a308 = ahgz.a();
                a308.ax(3);
                return (ahgz)a308.build();
            }
            case 111: {
                final ahcr a309 = ahgz.a();
                a309.ax(3);
                return (ahgz)a309.build();
            }
            case 110: {
                final ahcr a310 = ahgz.a();
                a310.ax(2);
                return (ahgz)a310.build();
            }
            case 109: {
                final ahcr a311 = ahgz.a();
                a311.ax(3);
                return (ahgz)a311.build();
            }
            case 108: {
                final ahcr a312 = ahgz.a();
                a312.ax(3);
                return (ahgz)a312.build();
            }
            case 107: {
                final ahcr a313 = ahgz.a();
                a313.ax(2);
                return (ahgz)a313.build();
            }
            case 106: {
                final ahcr a314 = ahgz.a();
                a314.ax(3);
                return (ahgz)a314.build();
            }
            case 105: {
                final ahcr a315 = ahgz.a();
                a315.ax(3);
                return (ahgz)a315.build();
            }
            case 104: {
                final ahcr a316 = ahgz.a();
                a316.ax(3);
                return (ahgz)a316.build();
            }
            case 103: {
                final ahcr a317 = ahgz.a();
                a317.ax(3);
                return (ahgz)a317.build();
            }
            case 102: {
                final ahcr a318 = ahgz.a();
                a318.ax(3);
                return (ahgz)a318.build();
            }
            case 101: {
                final ahcr a319 = ahgz.a();
                a319.ax(3);
                return (ahgz)a319.build();
            }
            case 100: {
                final ahcr a320 = ahgz.a();
                a320.ax(3);
                return (ahgz)a320.build();
            }
        }
    }
    
    public static boolean d(final int n) {
        return n == 13 || n == 14;
    }
    
    public static void e(final Parcel parcel, final Parcelable parcelable) {
        if (parcelable != null) {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }
    
    public static Object f(final Parcel parcel, final Parcelable$Creator parcelable$Creator) {
        if (parcel.readInt() != 0) {
            return parcelable$Creator.createFromParcel(parcel);
        }
        return null;
    }
    
    public static String g(final int n) {
        switch (n) {
            default: {
                return "CENTER_Y";
            }
            case 8: {
                return "CENTER_X";
            }
            case 7: {
                return "CENTER";
            }
            case 6: {
                return "BASELINE";
            }
            case 5: {
                return "BOTTOM";
            }
            case 4: {
                return "RIGHT";
            }
            case 3: {
                return "TOP";
            }
            case 2: {
                return "LEFT";
            }
        }
    }
    
    public static kh h(final Context context, final br br, boolean equals, final boolean b) {
        final bo r = br.R;
        final int n = 0;
        int f;
        if (r == null) {
            f = 0;
        }
        else {
            f = r.f;
        }
        int n2;
        if (b) {
            if (equals) {
                n2 = br.nU();
            }
            else {
                n2 = br.nJ();
            }
        }
        else if (equals) {
            n2 = br.nh();
        }
        else {
            n2 = br.nT();
        }
        br.af(0, 0, 0, 0);
        final ViewGroup n3 = br.N;
        if (n3 != null && n3.getTag(2131432388) != null) {
            br.N.setTag(2131432388, (Object)null);
        }
        final ViewGroup n4 = br.N;
        if (n4 != null && n4.getLayoutTransition() != null) {
            return null;
        }
        br.aI(f, n2);
        br.aJ(f, n2);
        if (n2 == 0) {
            n2 = n;
            if (f != 0) {
                if (f != 4097) {
                    if (f != 8194) {
                        if (f != 8197) {
                            if (f != 4099) {
                                if (f != 4100) {
                                    n2 = -1;
                                }
                                else if (equals) {
                                    n2 = j(context, 16842936);
                                }
                                else {
                                    n2 = j(context, 16842937);
                                }
                            }
                            else if (!equals) {
                                n2 = 2130837514;
                            }
                            else {
                                n2 = 2130837513;
                            }
                        }
                        else if (equals) {
                            n2 = j(context, 16842938);
                        }
                        else {
                            n2 = j(context, 16842939);
                        }
                    }
                    else if (!equals) {
                        n2 = 2130837512;
                    }
                    else {
                        n2 = 2130837511;
                    }
                }
                else if (!equals) {
                    n2 = 2130837516;
                }
                else {
                    n2 = 2130837515;
                }
            }
        }
        if (n2 == 0) {
            goto Label_0418;
        }
        equals = "anim".equals(context.getResources().getResourceTypeName(n2));
        if (equals) {
            try {
                final Animation loadAnimation = AnimationUtils.loadAnimation(context, n2);
                if (loadAnimation != null) {
                    return new kh(loadAnimation);
                }
                goto Label_0418;
            }
            catch (final Resources$NotFoundException ex) {
                throw ex;
            }
            catch (final RuntimeException ex2) {}
        }
        try {
            final Animator loadAnimator = AnimatorInflater.loadAnimator(context, n2);
            if (loadAnimator != null) {
                return new kh(loadAnimator);
            }
            goto Label_0418;
        }
        catch (final RuntimeException ex3) {}
    }
    
    public static void i(final afmp afmp, final String s, final String s2, final String s3, final char c, final String s4, final Throwable t) {
        ((afly)((afly)((afly)afmp).i(t)).j(s2, s3, (int)c, s4)).r(s);
    }
    
    private static int j(final Context context, int resourceId) {
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(16973825, new int[] { resourceId });
        resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }
}
