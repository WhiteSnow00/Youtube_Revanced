import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arbk extends ahbh implements ahcw
{
    public static final arbk a;
    private static volatile ahdd o;
    public int b;
    public int c;
    public Object d;
    public String e;
    public arbj f;
    public ajmi g;
    public String h;
    public int i;
    public arbe j;
    public apkt k;
    public String l;
    public arbh m;
    public arbm n;
    
    static {
        ahbh.registerDefaultInstance((Class)arbk.class, (ahbh)(a = new arbk()));
    }
    
    private arbk() {
        this.c = 0;
        this.e = "";
        this.h = "";
        this.l = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd o3;
                if ((o3 = arbk.o) == null) {
                    synchronized (arbk.class) {
                        if (arbk.o == null) {
                            arbk.o = (ahdd)new ahba((ahbh)arbk.a);
                        }
                    }
                }
                return o3;
            }
            case 5: {
                return arbk.a;
            }
            case 4: {
                return new ahaz((ahbh)arbk.a);
            }
            case 3: {
                return new arbk();
            }
            case 2: {
                return newMessageInfo((MessageLite)arbk.a, "\u0001\f\u0001\u0001\u0001\r\f\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1009\u0001\u0003\u103c\u0000\u0004\u1009\u0004\u0005\u1008\u0005\u0006\u103c\u0000\u0007\u100c\u0006\t\u1009\u0007\n\u1009\b\u000b\u1008\t\f\u1009\n\r\u1009\u000b", new Object[] { "d", "c", "b", "e", "f", apks.class, "g", "h", apkx.class, "i", apow.g, "j", "k", "l", "m", "n" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
