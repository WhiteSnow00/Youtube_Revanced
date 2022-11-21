import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aorj extends ahcz implements aheo
{
    public static final aorj a;
    private static volatile ahev g;
    public int b;
    public ajws c;
    public aisc d;
    public ahbt e;
    public boolean f;
    private ahjl h;
    private byte i;
    
    static {
        ahcz.registerDefaultInstance(aorj.class, a = new aorj());
    }
    
    private aorj() {
        this.i = 2;
        this.e = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev g;
                if ((g = aorj.g) == null) {
                    synchronized (aorj.class) {
                        if (aorj.g == null) {
                            aorj.g = (ahev)new ahcs((ahcz)aorj.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aorj.a;
            }
            case 4: {
                return new ahcr((ahcz)aorj.a);
            }
            case 3: {
                return new aorj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aorj.a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0004\u1409\u0003\u0005\u100a\u0004\u0006\u1007\u0005", new Object[] { "b", "c", "d", "h", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
