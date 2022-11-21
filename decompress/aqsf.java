import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqsf extends ahcz implements aheo
{
    public static final aqsf a;
    private static volatile ahev e;
    public int b;
    public int c;
    public ahej d;
    
    static {
        ahcz.registerDefaultInstance(aqsf.class, a = new aqsf());
    }
    
    private aqsf() {
        this.d = ahej.a;
    }
    
    public final ahej a() {
        final ahej d = this.d;
        if (!d.b) {
            this.d = d.a();
        }
        return this.d;
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
                if ((e = aqsf.e) == null) {
                    synchronized (aqsf.class) {
                        if (aqsf.e == null) {
                            aqsf.e = (ahev)new ahcs((ahcz)aqsf.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqsf.a;
            }
            case 4: {
                return new ahcr((float[][])null, (char[][])null);
            }
            case 3: {
                return new aqsf();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqsf.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u1004\u0000\u00022", new Object[] { "b", "c", "d", aqse.a });
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
