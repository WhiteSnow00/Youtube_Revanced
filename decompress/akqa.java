import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akqa extends ahcz implements aheo
{
    public static final akqa a;
    private static volatile ahev e;
    public int b;
    public String c;
    public long d;
    
    static {
        ahcz.registerDefaultInstance(akqa.class, a = new akqa());
    }
    
    private akqa() {
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
                final ahev e;
                if ((e = akqa.e) == null) {
                    synchronized (akqa.class) {
                        if (akqa.e == null) {
                            akqa.e = (ahev)new ahcs((ahcz)akqa.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return akqa.a;
            }
            case 4: {
                return new ahcr((ahcz)akqa.a);
            }
            case 3: {
                return new akqa();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akqa.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1002\u0001", new Object[] { "b", "c", "d" });
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
