import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqag extends agzi implements ahax
{
    public static final aqag a;
    public static final agzg b;
    private static volatile ahbe d;
    public agzy c;
    
    static {
        final aqag a2 = new aqag();
        agzi.registerDefaultInstance(aqag.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)aqaf.a, a2, (MessageLite)a2, null, 1, ahcm.k, aqag.class);
    }
    
    private aqag() {
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
                final ahbe d;
                if ((d = aqag.d) == null) {
                    synchronized (aqag.class) {
                        if (aqag.d == null) {
                            aqag.d = (ahbe)new agzb((agzi)aqag.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqag.a;
            }
            case 4: {
                return new agza((agzi)aqag.a);
            }
            case 3: {
                return new aqag();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqag.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "c", aqai.class });
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
