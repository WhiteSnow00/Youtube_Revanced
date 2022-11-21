import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akyy extends ahcz implements aheo
{
    public static final akyy a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(akyy.class, a = new akyy());
    }
    
    private akyy() {
        this.b = 0;
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
                if ((d = akyy.d) == null) {
                    synchronized (akyy.class) {
                        if (akyy.d == null) {
                            akyy.d = (ahev)new ahcs((ahcz)akyy.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akyy.a;
            }
            case 4: {
                return new ahcr((ahcz)akyy.a);
            }
            case 3: {
                return new akyy();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akyy.a, "\u0001\t\u0001\u0000\uf364\u1bd3\ue2df\ua7cb\t\u0000\u0000\b\uf364\u1bd3\u143c\u0000\uf321\u1e90\u143c\u0000\ue80f\u1ecc\u143c\u0000\uf767\u224e\u143c\u0000\ue94e\u22ec\u143c\u0000\ue22b\u2916\u143c\u0000\uf811\u2b8e\u143c\u0000\uf2ec\u69c5\u103c\u0000\ue2df\ua7cb\u143c\u0000", new Object[] { "c", "b", anhd.class, aizd.class, anhv.class, anhw.class, anhk.class, aqak.class, anjl.class, aihb.class, anhc.class });
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
