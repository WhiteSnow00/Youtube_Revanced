import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alad extends agzi implements ahax
{
    public static final alad a;
    private static volatile ahbe f;
    public int b;
    public akjf c;
    public alae d;
    public agzy e;
    private ajtl g;
    private byte h;
    
    static {
        agzi.registerDefaultInstance((Class)alad.class, (agzi)(a = new alad()));
    }
    
    private alad() {
        this.h = 2;
        this.e = emptyProtobufList();
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
                if ((f = alad.f) == null) {
                    synchronized (alad.class) {
                        if (alad.f == null) {
                            alad.f = (ahbe)new agzb((agzi)alad.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return alad.a;
            }
            case 4: {
                return new agza((agzi)alad.a);
            }
            case 3: {
                return new alad();
            }
            case 2: {
                return newMessageInfo((MessageLite)alad.a, "\u0001\u0004\u0000\u0001\u0001\u0309\u0004\u0000\u0001\u0003\u0001\u1409\u0000\u0003\u1009\u0001\u0004\u041b\u0309\u1409\u0002", new Object[] { "b", "c", "d", "e", aioe.class, "g" });
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
