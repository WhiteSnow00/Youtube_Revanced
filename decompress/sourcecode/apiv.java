import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apiv extends agzi implements ahax
{
    public static final apiv a;
    private static volatile ahbe e;
    public int b;
    public agzy c;
    public float d;
    
    static {
        agzi.registerDefaultInstance(apiv.class, a = new apiv());
    }
    
    private apiv() {
        this.c = agzi.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = apiv.e) == null) {
                    synchronized (apiv.class) {
                        if (apiv.e == null) {
                            apiv.e = (ahbe)new agzb((agzi)apiv.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return apiv.a;
            }
            case 4: {
                return new agza((byte[][][])null, (byte[][])null);
            }
            case 3: {
                return new apiv();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apiv.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u1001\u0000", new Object[] { "b", "c", apiu.class, "d" });
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
