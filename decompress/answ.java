import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class answ extends ahcz implements aheo
{
    public static final answ a;
    private static volatile ahev e;
    public int b;
    public ajws c;
    public aisc d;
    private ahjl f;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(answ.class, a = new answ());
    }
    
    private answ() {
        this.g = 2;
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = answ.e) == null) {
                    synchronized (answ.class) {
                        if (answ.e == null) {
                            answ.e = (ahev)new ahcs((ahcz)answ.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return answ.a;
            }
            case 4: {
                return new ahcr((ahcz)answ.a);
            }
            case 3: {
                return new answ();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)answ.a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0003\u0005\u1409\u0002", new Object[] { "b", "c", "f", "d" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
