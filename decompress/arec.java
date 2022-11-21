import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arec extends ahcz implements aheo
{
    public static final arec a;
    private static volatile ahev f;
    public int b;
    public String c;
    public long d;
    public long e;
    
    static {
        ahcz.registerDefaultInstance(arec.class, a = new arec());
    }
    
    private arec() {
        this.c = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = arec.f) == null) {
                    synchronized (arec.class) {
                        if (arec.f == null) {
                            arec.f = (ahev)new ahcs((ahcz)arec.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return arec.a;
            }
            case 4: {
                return new ahcr((ahcz)arec.a);
            }
            case 3: {
                return new arec();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)arec.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1002\u0001\u0003\u1002\u0002", new Object[] { "b", "c", "d", "e" });
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
