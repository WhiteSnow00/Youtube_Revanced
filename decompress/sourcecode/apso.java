import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apso extends agzi implements ahax
{
    public static final apso a;
    private static volatile ahbe f;
    public int b;
    public float c;
    public float d;
    public float e;
    
    static {
        agzi.registerDefaultInstance((Class)apso.class, (agzi)(a = new apso()));
    }
    
    private apso() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = apso.f) == null) {
                    synchronized (apso.class) {
                        if (apso.f == null) {
                            apso.f = (ahbe)new agzb((agzi)apso.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apso.a;
            }
            case 4: {
                return new agza((agzi)apso.a);
            }
            case 3: {
                return new apso();
            }
            case 2: {
                return newMessageInfo((MessageLite)apso.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1001\u0000\u0002\u1001\u0001\u0003\u1001\u0002", new Object[] { "b", "c", "d", "e" });
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
