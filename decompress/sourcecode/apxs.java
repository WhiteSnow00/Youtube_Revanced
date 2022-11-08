import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apxs extends agzi implements ahax
{
    public static final apxs a;
    private static volatile ahbe f;
    public int b;
    public ahca c;
    public ahas d;
    public agzy e;
    
    static {
        agzi.registerDefaultInstance(apxs.class, a = new apxs());
    }
    
    private apxs() {
        this.d = ahas.a;
        this.e = agzi.emptyProtobufList();
    }
    
    public final ahas a() {
        final ahas d = this.d;
        if (!d.b) {
            this.d = d.a();
        }
        return this.d;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = apxs.f) == null) {
                    synchronized (apxs.class) {
                        if (apxs.f == null) {
                            apxs.f = (ahbe)new agzb((agzi)apxs.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apxs.a;
            }
            case 4: {
                return new agza((int[])null, (short[])null);
            }
            case 3: {
                return new apxs();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apxs.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0001\u0000\u0001\u1009\u0000\u00022\u0003\u001a", new Object[] { "b", "c", "d", apxr.a, "e" });
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
