import java.util.ArrayList;
import java.util.Map;
import android.net.Uri;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class btg implements btn
{
    private static final int[] a;
    private static final dml b;
    private static final dml c;
    
    static {
        a = new int[] { 5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14 };
        b = new dml((btf)bte.b);
        c = new dml((btf)bte.a);
    }
    
    private static final void b(final int n, final List list) {
        switch (n) {
            case 16: {
                list.add(new buj());
                return;
            }
            case 15: {
                final btj j = btg.c.J(new Object[0]);
                if (j != null) {
                    list.add(j);
                    return;
                }
                break;
            }
            case 14: {
                list.add(new buz());
                return;
            }
            case 12: {
                list.add(new cat());
                return;
            }
            case 11: {
                list.add(new can(null));
                return;
            }
            case 10: {
                list.add(new cag());
                return;
            }
            case 9: {
                list.add(new bwx());
                return;
            }
            case 8: {
                list.add(new bwm(null));
                list.add(new bwp(null));
                return;
            }
            case 7: {
                list.add(new bvv(null));
                return;
            }
            case 6: {
                list.add(new bvr(0));
                return;
            }
            case 5: {
                list.add(new buu());
                return;
            }
            case 4: {
                final btj i = btg.b.J(new Object[] { 0 });
                if (i != null) {
                    list.add(i);
                    return;
                }
                list.add(new bus(null));
                return;
            }
            case 3: {
                list.add(new bug(null));
                return;
            }
            case 2: {
                list.add(new bzl(null));
                return;
            }
            case 1: {
                list.add(new bzj(0));
                return;
            }
            case 0: {
                list.add(new bzj(1, null));
                break;
            }
        }
    }
    
    public final btj[] a(final Uri uri, final Map map) {
        monitorenter(this);
        try {
            final ArrayList list = new ArrayList(16);
            final List list2 = map.get("Content-Type");
            String s2;
            final String s = s2 = null;
            if (list2 != null) {
                if (list2.isEmpty()) {
                    s2 = s;
                }
                else {
                    s2 = (String)list2.get(0);
                }
            }
            final int n = 14;
            int n3 = 0;
            Label_0923: {
                if (s2 != null) {
                    final String g = ayz.g(s2);
                    int n2 = 0;
                    Label_0697: {
                        switch (g.hashCode()) {
                            case 2039520277: {
                                if (g.equals("video/x-matroska")) {
                                    n2 = 10;
                                    break Label_0697;
                                }
                                break;
                            }
                            case 1505118770: {
                                if (g.equals("audio/webm")) {
                                    n2 = 13;
                                    break Label_0697;
                                }
                                break;
                            }
                            case 1504831518: {
                                if (g.equals("audio/mpeg")) {
                                    n2 = 15;
                                    break Label_0697;
                                }
                                break;
                            }
                            case 1504824762: {
                                if (g.equals("audio/midi")) {
                                    n2 = 9;
                                    break Label_0697;
                                }
                                break;
                            }
                            case 1504619009: {
                                if (g.equals("audio/flac")) {
                                    n2 = 7;
                                    break Label_0697;
                                }
                                break;
                            }
                            case 1504578661: {
                                if (g.equals("audio/eac3")) {
                                    n2 = 1;
                                    break Label_0697;
                                }
                                break;
                            }
                            case 1503095341: {
                                if (g.equals("audio/3gpp")) {
                                    n2 = 5;
                                    break Label_0697;
                                }
                                break;
                            }
                            case 1331848029: {
                                if (g.equals("video/mp4")) {
                                    n2 = 16;
                                    break Label_0697;
                                }
                                break;
                            }
                            case 187099443: {
                                if (g.equals("audio/wav")) {
                                    n2 = 22;
                                    break Label_0697;
                                }
                                break;
                            }
                            case 187091926: {
                                if (g.equals("audio/ogg")) {
                                    n2 = 19;
                                    break Label_0697;
                                }
                                break;
                            }
                            case 187090232: {
                                if (g.equals("audio/mp4")) {
                                    n2 = 17;
                                    break Label_0697;
                                }
                                break;
                            }
                            case 187078669: {
                                if (g.equals("audio/amr")) {
                                    n2 = 4;
                                    break Label_0697;
                                }
                                break;
                            }
                            case 187078297: {
                                if (g.equals("audio/ac4")) {
                                    n2 = 3;
                                    break Label_0697;
                                }
                                break;
                            }
                            case 187078296: {
                                if (g.equals("audio/ac3")) {
                                    n2 = 0;
                                    break Label_0697;
                                }
                                break;
                            }
                            case 13915911: {
                                if (g.equals("video/x-flv")) {
                                    n2 = 8;
                                    break Label_0697;
                                }
                                break;
                            }
                            case -43467528: {
                                if (g.equals("application/webm")) {
                                    n2 = 14;
                                    break Label_0697;
                                }
                                break;
                            }
                            case -387023398: {
                                if (g.equals("audio/x-matroska")) {
                                    n2 = 11;
                                    break Label_0697;
                                }
                                break;
                            }
                            case -1004728940: {
                                if (g.equals("text/vtt")) {
                                    n2 = 23;
                                    break Label_0697;
                                }
                                break;
                            }
                            case -1079884372: {
                                if (g.equals("video/x-msvideo")) {
                                    n2 = 25;
                                    break Label_0697;
                                }
                                break;
                            }
                            case -1248337486: {
                                if (g.equals("application/mp4")) {
                                    n2 = 18;
                                    break Label_0697;
                                }
                                break;
                            }
                            case -1487394660: {
                                if (g.equals("image/jpeg")) {
                                    n2 = 24;
                                    break Label_0697;
                                }
                                break;
                            }
                            case -1606874997: {
                                if (g.equals("audio/amr-wb")) {
                                    n2 = 6;
                                    break Label_0697;
                                }
                                break;
                            }
                            case -1662095187: {
                                if (g.equals("video/webm")) {
                                    n2 = 12;
                                    break Label_0697;
                                }
                                break;
                            }
                            case -1662384007: {
                                if (g.equals("video/mp2t")) {
                                    n2 = 21;
                                    break Label_0697;
                                }
                                break;
                            }
                            case -1662384011: {
                                if (g.equals("video/mp2p")) {
                                    n2 = 20;
                                    break Label_0697;
                                }
                                break;
                            }
                            case -2123537834: {
                                if (g.equals("audio/eac3-joc")) {
                                    n2 = 2;
                                    break Label_0697;
                                }
                                break;
                            }
                        }
                        n2 = -1;
                    }
                    switch (n2) {
                        case 25: {
                            n3 = 16;
                            break Label_0923;
                        }
                        case 24: {
                            n3 = 14;
                            break Label_0923;
                        }
                        case 23: {
                            n3 = 13;
                            break Label_0923;
                        }
                        case 22: {
                            n3 = 12;
                            break Label_0923;
                        }
                        case 21: {
                            n3 = 11;
                            break Label_0923;
                        }
                        case 20: {
                            n3 = 10;
                            break Label_0923;
                        }
                        case 19: {
                            n3 = 9;
                            break Label_0923;
                        }
                        case 16:
                        case 17:
                        case 18: {
                            n3 = 8;
                            break Label_0923;
                        }
                        case 15: {
                            n3 = 7;
                            break Label_0923;
                        }
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14: {
                            n3 = 6;
                            break Label_0923;
                        }
                        case 9: {
                            n3 = 15;
                            break Label_0923;
                        }
                        case 8: {
                            n3 = 5;
                            break Label_0923;
                        }
                        case 7: {
                            n3 = 4;
                            break Label_0923;
                        }
                        case 4:
                        case 5:
                        case 6: {
                            n3 = 3;
                            break Label_0923;
                        }
                        case 3: {
                            n3 = 1;
                            break Label_0923;
                        }
                        case 0:
                        case 1:
                        case 2: {
                            n3 = 0;
                            break Label_0923;
                        }
                    }
                }
                n3 = -1;
            }
            if (n3 != -1) {
                b(n3, list);
            }
            final String lastPathSegment = uri.getLastPathSegment();
            int n4 = 0;
            Label_1418: {
                if (lastPathSegment != null) {
                    if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
                        n4 = 0;
                        break Label_1418;
                    }
                    if (lastPathSegment.endsWith(".ac4")) {
                        n4 = 1;
                        break Label_1418;
                    }
                    if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
                        n4 = 2;
                        break Label_1418;
                    }
                    if (lastPathSegment.endsWith(".amr")) {
                        n4 = 3;
                        break Label_1418;
                    }
                    if (lastPathSegment.endsWith(".flac")) {
                        n4 = 4;
                        break Label_1418;
                    }
                    if (lastPathSegment.endsWith(".flv")) {
                        n4 = 5;
                        break Label_1418;
                    }
                    if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
                        n4 = 15;
                        break Label_1418;
                    }
                    if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
                        n4 = 6;
                        break Label_1418;
                    }
                    if (lastPathSegment.endsWith(".mp3")) {
                        n4 = 7;
                        break Label_1418;
                    }
                    if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
                        n4 = 8;
                        break Label_1418;
                    }
                    if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
                        n4 = 9;
                        break Label_1418;
                    }
                    if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
                        n4 = 10;
                        break Label_1418;
                    }
                    if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
                        n4 = 11;
                        break Label_1418;
                    }
                    if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
                        n4 = 12;
                        break Label_1418;
                    }
                    if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
                        n4 = 13;
                        break Label_1418;
                    }
                    n4 = n;
                    if (lastPathSegment.endsWith(".jpg")) {
                        break Label_1418;
                    }
                    if (lastPathSegment.endsWith(".jpeg")) {
                        n4 = n;
                        break Label_1418;
                    }
                    if (lastPathSegment.endsWith(".avi")) {
                        n4 = 16;
                        break Label_1418;
                    }
                }
                n4 = -1;
            }
            if (n4 != -1 && n4 != n3) {
                b(n4, list);
            }
            final int[] a = btg.a;
            for (int i = 0; i < 16; ++i) {
                final int n5 = a[i];
                if (n5 != n3 && n5 != n4) {
                    b(n5, list);
                }
            }
            final btj[] array = (btj[])list.toArray(new btj[list.size()]);
            monitorexit(this);
            return array;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
