import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqvf extends ahcz implements aheo
{
    public static final aqvf a;
    private static volatile ahev e;
    public int b;
    public ahbt c;
    public String d;
    
    static {
        ahcz.registerDefaultInstance(aqvf.class, a = new aqvf());
    }
    
    private aqvf() {
        this.c = ahbt.b;
        this.d = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = aqvf.e) == null) {
                    synchronized (aqvf.class) {
                        if (aqvf.e == null) {
                            aqvf.e = (ahev)new ahcs((ahcz)aqvf.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqvf.a;
            }
            case 4: {
                return new ahcr((ahcz)aqvf.a);
            }
            case 3: {
                return new aqvf();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqvf.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100a\u0000\u0002\u1008\u0001", new Object[] { "b", "c", "d" });
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
