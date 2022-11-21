import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqcq extends ahcz implements aheo
{
    public static final aqcq a;
    private static volatile ahev f;
    public int b;
    public ahfq c;
    public ahej d;
    public ahdp e;
    
    static {
        ahcz.registerDefaultInstance(aqcq.class, a = new aqcq());
    }
    
    private aqcq() {
        this.d = ahej.a;
        this.e = ahcz.emptyProtobufList();
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
                final ahev f;
                if ((f = aqcq.f) == null) {
                    synchronized (aqcq.class) {
                        if (aqcq.f == null) {
                            aqcq.f = (ahev)new ahcs((ahcz)aqcq.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqcq.a;
            }
            case 4: {
                return new ahcr((char[][])null, (char[][])null);
            }
            case 3: {
                return new aqcq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqcq.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0001\u0000\u0001\u1009\u0000\u00022\u0003\u001a", new Object[] { "b", "c", "d", aqcp.a, "e" });
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
