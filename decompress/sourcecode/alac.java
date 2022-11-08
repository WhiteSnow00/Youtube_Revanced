import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alac extends agzi implements ahax
{
    public static final alac a;
    private static volatile ahbe f;
    public int b;
    public akjd c;
    public String d;
    public String e;
    private byte g;
    
    static {
        agzi.registerDefaultInstance((Class)alac.class, (agzi)(a = new alac()));
    }
    
    private alac() {
        this.g = 2;
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
                final ahbe f;
                if ((f = alac.f) == null) {
                    synchronized (alac.class) {
                        if (alac.f == null) {
                            alac.f = (ahbe)new agzb((agzi)alac.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return alac.a;
            }
            case 4: {
                return new agza((agzi)alac.a);
            }
            case 3: {
                return new alac();
            }
            case 2: {
                return newMessageInfo((MessageLite)alac.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1008\u0001\u0003\u1008\u0002", new Object[] { "b", "c", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.g = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
