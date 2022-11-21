import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amis extends ahcz implements aheo
{
    public static final amis a;
    private static volatile ahev r;
    public int b;
    public amit c;
    public amix d;
    public amiw e;
    public amjd f;
    public amio g;
    public amip h;
    public amjc i;
    public aphc j;
    public aphd k;
    public amiz l;
    public apga m;
    public amik n;
    public aomp o;
    public ajon p;
    public amiu q;
    private byte s;
    
    static {
        ahcz.registerDefaultInstance(amis.class, a = new amis());
    }
    
    private amis() {
        this.s = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte s = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev r;
                if ((r = amis.r) == null) {
                    synchronized (amis.class) {
                        if (amis.r == null) {
                            amis.r = (ahev)new ahcs((ahcz)amis.a);
                        }
                    }
                }
                return r;
            }
            case 5: {
                return amis.a;
            }
            case 4: {
                return new ahcr((ahcz)amis.a);
            }
            case 3: {
                return new amis();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amis.a, "\u0001\u000f\u0000\u0001\uef94\u1fae\ue381\uc0d1\u000f\u0000\u0000\u000e\uef94\u1fae\u1409\u0000\uefc3\u1fae\u1409\u0001\ufd83\u24d6\u1409\u0005\ueea7\u24d7\u1409\u0004\uf42d\u259a\u1409\u0003\uf492\u4933\u1409\r\ue8e7\u4d13\u1409\u0006\uf389\u6ac0\u1409\u0007\ufe49\u6df9\u1409\b\ufea5\u74e7\u1409\t\uea03\u78ed\u1409\n\ue957\u8325\u1409\u000b\uef21\u961f\u1409\f\uf7d1\ua0a4\u1409\u0002\ue381\uc0d1\u1009\u000e", new Object[] { "b", "c", "d", "h", "g", "f", "p", "i", "j", "k", "l", "m", "n", "o", "e", "q" });
            }
            case 1: {
                if (o == null) {
                    s = 0;
                }
                this.s = s;
                return null;
            }
            case 0: {
                return this.s;
            }
        }
    }
}
