import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akpz extends ahcz implements aheo
{
    public static final akpz a;
    private static volatile ahev e;
    public int b;
    public String c;
    public long d;
    
    static {
        ahcz.registerDefaultInstance(akpz.class, a = new akpz());
    }
    
    private akpz() {
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
                if ((e = akpz.e) == null) {
                    synchronized (akpz.class) {
                        if (akpz.e == null) {
                            akpz.e = (ahev)new ahcs((ahcz)akpz.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return akpz.a;
            }
            case 4: {
                return new ahcr((ahcz)akpz.a);
            }
            case 3: {
                return new akpz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akpz.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1002\u0001", new Object[] { "b", "c", "d" });
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
