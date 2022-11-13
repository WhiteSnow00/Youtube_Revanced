// 
// Decompiled by Procyon v0.6.0
// 

final class cyg
{
    private static final eab a;
    
    static {
        a = eab.y("ty", "d");
    }
    
    static cxb a(final czg czg, final ctv ctv) {
        czg.i();
        int n = 2;
        int b = 2;
        cxb cxb;
        String g;
        while (true) {
            final boolean o = czg.o();
            cxb = null;
            if (!o) {
                g = null;
                break;
            }
            final int r = czg.r(cyg.a);
            if (r == 0) {
                g = czg.g();
                break;
            }
            if (r != 1) {
                czg.m();
                czg.n();
            }
            else {
                b = czg.b();
            }
        }
        if (g == null) {
            return null;
        }
        Label_0405: {
            switch (g.hashCode()) {
                case 3710: {
                    if (g.equals("tr")) {
                        n = 5;
                        break Label_0405;
                    }
                    break;
                }
                case 3705: {
                    if (g.equals("tm")) {
                        n = 9;
                        break Label_0405;
                    }
                    break;
                }
                case 3681: {
                    if (g.equals("st")) {
                        n = 1;
                        break Label_0405;
                    }
                    break;
                }
                case 3679: {
                    if (g.equals("sr")) {
                        n = 10;
                        break Label_0405;
                    }
                    break;
                }
                case 3669: {
                    if (g.equals("sh")) {
                        n = 6;
                        break Label_0405;
                    }
                    break;
                }
                case 3646: {
                    if (g.equals("rp")) {
                        n = 12;
                        break Label_0405;
                    }
                    break;
                }
                case 3633: {
                    if (g.equals("rc")) {
                        n = 8;
                        break Label_0405;
                    }
                    break;
                }
                case 3488: {
                    if (g.equals("mm")) {
                        n = 11;
                        break Label_0405;
                    }
                    break;
                }
                case 3308: {
                    if (g.equals("gs")) {
                        break Label_0405;
                    }
                    break;
                }
                case 3307: {
                    if (g.equals("gr")) {
                        n = 0;
                        break Label_0405;
                    }
                    break;
                }
                case 3295: {
                    if (g.equals("gf")) {
                        n = 4;
                        break Label_0405;
                    }
                    break;
                }
                case 3270: {
                    if (g.equals("fl")) {
                        n = 3;
                        break Label_0405;
                    }
                    break;
                }
                case 3239: {
                    if (g.equals("el")) {
                        n = 7;
                        break Label_0405;
                    }
                    break;
                }
            }
            n = -1;
        }
        cxb cxb2 = null;
        switch (n) {
            default: {
                czk.a("Unknown shape type ".concat(g));
                cxb2 = cxb;
                break;
            }
            case 12: {
                cxb2 = cyw.a(czg, ctv);
                break;
            }
            case 11: {
                final cxe a = cyt.a(czg);
                ctv.d("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                cxb2 = a;
                break;
            }
            case 10: {
                cxb2 = cyu.a(czg, ctv);
                break;
            }
            case 9: {
                cxb2 = czc.a(czg, ctv);
                break;
            }
            case 8: {
                cxb2 = cyv.a(czg, ctv);
                break;
            }
            case 7: {
                cxb2 = cyf.a(czg, ctv, b);
                break;
            }
            case 6: {
                cxb2 = cza.a(czg, ctv);
                break;
            }
            case 5: {
                cxb2 = cye.a(czg, ctv);
                break;
            }
            case 4: {
                cxb2 = cym.a(czg, ctv);
                break;
            }
            case 3: {
                cxb2 = cyy.a(czg, ctv);
                break;
            }
            case 2: {
                cxb2 = cyn.a(czg, ctv);
                break;
            }
            case 1: {
                cxb2 = czb.a(czg, ctv);
                break;
            }
            case 0: {
                cxb2 = cyz.a(czg, ctv);
                break;
            }
        }
        while (czg.o()) {
            czg.n();
        }
        czg.k();
        return cxb2;
    }
}
