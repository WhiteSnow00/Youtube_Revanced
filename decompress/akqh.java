import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akqh extends ahcz implements aheo
{
    public static final akqh a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(akqh.class, a = new akqh());
    }
    
    private akqh() {
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
                if ((d = akqh.d) == null) {
                    synchronized (akqh.class) {
                        if (akqh.d == null) {
                            akqh.d = (ahev)new ahcs((ahcz)akqh.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akqh.a;
            }
            case 4: {
                return new ahcr((ahcz)akqh.a);
            }
            case 3: {
                return new akqh();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akqh.a, "\u0001\u0002\u0001\u0000\ue55e\u2847\ued00\u32da\u0002\u0000\u0000\u0002\ue55e\u2847\u143c\u0000\ued00\u32da\u143c\u0000", new Object[] { "c", "b", aoru.class, akqb.class });
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
