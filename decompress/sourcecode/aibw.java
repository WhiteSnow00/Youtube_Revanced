import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aibw extends agzi implements ahax
{
    public static final aibw a;
    private static volatile ahbe f;
    public int b;
    public aokb c;
    public aigk d;
    public apem e;
    private aibb g;
    private byte h;
    
    static {
        agzi.registerDefaultInstance((Class)aibw.class, (agzi)(a = new aibw()));
    }
    
    private aibw() {
        this.h = 2;
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
                if ((f = aibw.f) == null) {
                    synchronized (aibw.class) {
                        if (aibw.f == null) {
                            aibw.f = (ahbe)new agzb((agzi)aibw.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aibw.a;
            }
            case 4: {
                return new agza((agzi)aibw.a);
            }
            case 3: {
                return new aibw();
            }
            case 2: {
                return newMessageInfo((MessageLite)aibw.a, "\u0001\u0004\u0000\u0001\ue084\u1870\ueb11\u1f11\u0004\u0000\u0000\u0004\ue084\u1870\u1409\u0001\ue2d9\u1a6d\u1409\u0000\ue61f\u1e16\u1409\u0002\ueb11\u1f11\u1409\u0003", new Object[] { "b", "d", "c", "e", "g" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.h = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
