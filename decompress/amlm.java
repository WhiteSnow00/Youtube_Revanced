import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amlm extends ahcz implements aheo
{
    public static final amlm a;
    private static volatile ahev d;
    public int b;
    public alhs c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(amlm.class, a = new amlm());
    }
    
    private amlm() {
        this.e = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = amlm.d) == null) {
                    synchronized (amlm.class) {
                        if (amlm.d == null) {
                            amlm.d = (ahev)new ahcs((ahcz)amlm.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amlm.a;
            }
            case 4: {
                return new ahcr((ahcz)amlm.a);
            }
            case 3: {
                return new amlm();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amlm.a, "\u0001\u0001\u0000\u0001\ue697\u3b15\ue697\u3b15\u0001\u0000\u0000\u0001\ue697\u3b15\u1409\u0000", new Object[] { "b", "c" });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
