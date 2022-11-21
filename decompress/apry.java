import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apry extends ahcz implements aheo
{
    public static final apry a;
    private static volatile ahev i;
    public int b;
    public ahbt c;
    public int d;
    public int e;
    public int f;
    public apry g;
    public aiou h;
    
    static {
        ahcz.registerDefaultInstance(apry.class, a = new apry());
    }
    
    private apry() {
        this.c = ahbt.b;
        this.e = -1;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev i;
                if ((i = apry.i) == null) {
                    synchronized (apry.class) {
                        if (apry.i == null) {
                            apry.i = (ahev)new ahcs((ahcz)apry.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return apry.a;
            }
            case 4: {
                return new ahcr((ahcz)apry.a);
            }
            case 3: {
                return new apry();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apry.a, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001\u100a\u0000\u0002\u1004\u0001\u0003\u1004\u0002\u0006\u1004\u0003\u0007\u1009\u0004\b\u1009\u0006", new Object[] { "b", "c", "d", "e", "f", "g", "h" });
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
