import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aorc extends ahcz implements aheo
{
    public static final aorc a;
    private static volatile ahev d;
    public int b;
    public Object c;
    
    static {
        ahcz.registerDefaultInstance(aorc.class, a = new aorc());
    }
    
    private aorc() {
        this.b = 0;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = aorc.d) == null) {
                    synchronized (aorc.class) {
                        if (aorc.d == null) {
                            aorc.d = (ahev)new ahcs((ahcz)aorc.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aorc.a;
            }
            case 4: {
                return new ahcr((ahcz)aorc.a);
            }
            case 3: {
                return new aorc();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aorc.a, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u103c\u0000\u0002\u103c\u0000\u0003\u103f\u0000", new Object[] { "c", "b", aorb.class, aord.class, aorf.a() });
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
