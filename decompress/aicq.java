import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aicq extends ahcz implements aheo
{
    public static final aicq a;
    private static volatile ahev b;
    private int c;
    private aplb d;
    private ajhc e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(aicq.class, a = new aicq());
    }
    
    private aicq() {
        this.f = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = aicq.b) == null) {
                    synchronized (aicq.class) {
                        if (aicq.b == null) {
                            aicq.b = (ahev)new ahcs((ahcz)aicq.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aicq.a;
            }
            case 4: {
                return new ahcr((ahcz)aicq.a);
            }
            case 3: {
                return new aicq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aicq.a, "\u0001\u0002\u0000\u0001\ufc43\u196f\ue607\u2a05\u0002\u0000\u0000\u0002\ufc43\u196f\u1409\u0001\ue607\u2a05\u1409\u0000", new Object[] { "c", "e", "d" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
