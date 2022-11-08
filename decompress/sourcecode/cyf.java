// 
// Decompiled by Procyon v0.6.0
// 

final class cyf
{
    private static final eaa a;
    
    static {
        a = eaa.y("ty", "d");
    }
    
    static cxa a(final czf czf, final ctu ctu) {
        czf.i();
        int n = 2;
        int b = 2;
        cxa cxa;
        String g;
        while (true) {
            final boolean o = czf.o();
            cxa = null;
            if (!o) {
                g = null;
                break;
            }
            final int r = czf.r(cyf.a);
            if (r == 0) {
                g = czf.g();
                break;
            }
            if (r != 1) {
                czf.m();
                czf.n();
            }
            else {
                b = czf.b();
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
        Object o2 = null;
        switch (n) {
            default: {
                czj.a("Unknown shape type ".concat(g));
                o2 = cxa;
                break;
            }
            case 12: {
                o2 = cyv.a(czf, ctu);
                break;
            }
            case 11: {
                final cxd a = cys.a(czf);
                ctu.d("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                o2 = a;
                break;
            }
            case 10: {
                o2 = cyt.a(czf, ctu);
                break;
            }
            case 9: {
                o2 = czb.a(czf, ctu);
                break;
            }
            case 8: {
                o2 = cyu.a(czf, ctu);
                break;
            }
            case 7: {
                o2 = cye.a(czf, ctu, b);
                break;
            }
            case 6: {
                o2 = cyz.a(czf, ctu);
                break;
            }
            case 5: {
                o2 = cyd.a(czf, ctu);
                break;
            }
            case 4: {
                o2 = cyl.a(czf, ctu);
                break;
            }
            case 3: {
                o2 = cyx.a(czf, ctu);
                break;
            }
            case 2: {
                o2 = cym.a(czf, ctu);
                break;
            }
            case 1: {
                o2 = cza.a(czf, ctu);
                break;
            }
            case 0: {
                o2 = cyy.a(czf, ctu);
                break;
            }
        }
        while (czf.o()) {
            czf.n();
        }
        czf.k();
        return (cxa)o2;
    }
}
