import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alau extends agzi implements ahax
{
    public static final alau a;
    private static volatile ahbe e;
    public akjf b;
    public agzy c;
    public agzy d;
    private int f;
    private ajtl g;
    private byte h;
    
    static {
        agzi.registerDefaultInstance((Class)alau.class, (agzi)(a = new alau()));
    }
    
    private alau() {
        this.h = 2;
        this.c = emptyProtobufList();
        this.d = emptyProtobufList();
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
                final ahbe e;
                if ((e = alau.e) == null) {
                    synchronized (alau.class) {
                        if (alau.e == null) {
                            alau.e = (ahbe)new agzb((agzi)alau.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return alau.a;
            }
            case 4: {
                return new agza((agzi)alau.a);
            }
            case 3: {
                return new alau();
            }
            case 2: {
                return newMessageInfo((MessageLite)alau.a, "\u0001\u0004\u0000\u0001\u0001\u0309\u0004\u0000\u0002\u0004\u0001\u1409\u0000\u0003\u041b\u0004\u041b\u0309\u1409\u0001", new Object[] { "f", "b", "c", albb.class, "d", ansr.class, "g" });
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
