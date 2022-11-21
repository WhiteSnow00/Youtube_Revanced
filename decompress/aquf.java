import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aquf extends ahcz implements aheo
{
    public static final aquf a;
    private static volatile ahev c;
    public ahdk b;
    
    static {
        ahcz.registerDefaultInstance(aquf.class, a = new aquf());
    }
    
    private aquf() {
        this.b = ahcz.emptyLongList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev c;
                if ((c = aquf.c) == null) {
                    synchronized (aquf.class) {
                        if (aquf.c == null) {
                            aquf.c = (ahev)new ahcs((ahcz)aquf.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aquf.a;
            }
            case 4: {
                return new ahcr((float[])null, (int[])null);
            }
            case 3: {
                return new aquf();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aquf.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0014", new Object[] { "b" });
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
