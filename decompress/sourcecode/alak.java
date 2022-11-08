import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alak extends agzi implements ahax
{
    public static final alak a;
    private static volatile ahbe h;
    public int b;
    public akjd c;
    public String d;
    public String e;
    public apgc f;
    public aila g;
    private byte i;
    
    static {
        agzi.registerDefaultInstance((Class)alak.class, (agzi)(a = new alak()));
    }
    
    private alak() {
        this.i = 2;
        this.d = "";
        this.e = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe h;
                if ((h = alak.h) == null) {
                    synchronized (alak.class) {
                        if (alak.h == null) {
                            alak.h = (ahbe)new agzb((agzi)alak.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return alak.a;
            }
            case 4: {
                return new agza((agzi)alak.a);
            }
            case 3: {
                return new alak();
            }
            case 2: {
                return newMessageInfo((MessageLite)alak.a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1009\u0003\u0006\u1009\u0005", new Object[] { "b", "c", "d", "e", "f", "g" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.i = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
