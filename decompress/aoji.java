import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoji extends ahcz implements aheo
{
    public static final aoji a;
    private static volatile ahev d;
    public int b;
    public aojh c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(aoji.class, a = new aoji());
    }
    
    private aoji() {
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
                if ((d = aoji.d) == null) {
                    synchronized (aoji.class) {
                        if (aoji.d == null) {
                            aoji.d = (ahev)new ahcs((ahcz)aoji.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aoji.a;
            }
            case 4: {
                return new ahcr((ahcz)aoji.a);
            }
            case 3: {
                return new aoji();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aoji.a, "\u0001\u0001\u0000\u0001\ufe1f\u32f7\ufe1f\u32f7\u0001\u0000\u0000\u0001\ufe1f\u32f7\u1409\u0000", new Object[] { "b", "c" });
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
