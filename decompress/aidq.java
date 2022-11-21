import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aidq extends ahcz implements aheo
{
    public static final aidq a;
    private static volatile ahev e;
    public int b;
    public String c;
    public boolean d;
    
    static {
        ahcz.registerDefaultInstance(aidq.class, a = new aidq());
    }
    
    private aidq() {
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
                if ((e = aidq.e) == null) {
                    synchronized (aidq.class) {
                        if (aidq.e == null) {
                            aidq.e = (ahev)new ahcs((ahcz)aidq.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aidq.a;
            }
            case 4: {
                return new ahcr((ahcz)aidq.a);
            }
            case 3: {
                return new aidq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aidq.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1007\u0001", new Object[] { "b", "c", "d" });
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
