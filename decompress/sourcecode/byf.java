import android.text.TextUtils;

// 
// Decompiled by Procyon v0.6.0
// 

final class byf
{
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    
    private byf(final int a, final int b, final int c, final int d, final int e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static byf a(final String s) {
        dk.f(s.startsWith("Format:"));
        final String[] split = TextUtils.split(s.substring(7), ",");
        int n = 0;
        int n2 = -1;
        int n3 = -1;
        int n4 = -1;
        int n5 = -1;
        int length;
        while (true) {
            length = split.length;
            if (n >= length) {
                break;
            }
            final String w = aeda.w(split[n].trim());
            int n6 = 0;
            Label_0170: {
                switch (w.hashCode()) {
                    case 109780401: {
                        if (w.equals("style")) {
                            n6 = 2;
                            break Label_0170;
                        }
                        break;
                    }
                    case 109757538: {
                        if (w.equals("start")) {
                            n6 = 0;
                            break Label_0170;
                        }
                        break;
                    }
                    case 3556653: {
                        if (w.equals("text")) {
                            n6 = 3;
                            break Label_0170;
                        }
                        break;
                    }
                    case 100571: {
                        if (w.equals("end")) {
                            n6 = 1;
                            break Label_0170;
                        }
                        break;
                    }
                }
                n6 = -1;
            }
            if (n6 != 0) {
                if (n6 != 1) {
                    if (n6 != 2) {
                        if (n6 == 3) {
                            n5 = n;
                        }
                    }
                    else {
                        n4 = n;
                    }
                }
                else {
                    n3 = n;
                }
            }
            else {
                n2 = n;
            }
            ++n;
        }
        if (n2 != -1 && n3 != -1 && n5 != -1) {
            return new byf(n2, n3, n4, n5, length);
        }
        return null;
    }
}
