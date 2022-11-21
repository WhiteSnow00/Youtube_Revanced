import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apzk extends ahcz implements aheo
{
    public static final apzk a;
    private static volatile ahev d;
    public int b;
    public apzl c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(apzk.class, a = new apzk());
    }
    
    private apzk() {
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
                if ((d = apzk.d) == null) {
                    synchronized (apzk.class) {
                        if (apzk.d == null) {
                            apzk.d = (ahev)new ahcs((ahcz)apzk.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apzk.a;
            }
            case 4: {
                return new ahcr((ahcz)apzk.a);
            }
            case 3: {
                return new apzk();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apzk.a, "\u0001\u0001\u0000\u0001\ued94\u1d9d\ued94\u1d9d\u0001\u0000\u0000\u0001\ued94\u1d9d\u1409\u0000", new Object[] { "b", "c" });
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
