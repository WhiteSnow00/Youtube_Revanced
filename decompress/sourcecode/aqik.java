import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqik extends agzi implements ahax
{
    public static final aqik a;
    public static final agzg b;
    private static volatile ahbe f;
    public int c;
    public String d;
    public float e;
    
    static {
        final aqik a2 = new aqik();
        agzi.registerDefaultInstance((Class)aqik.class, (agzi)(a = a2));
        b = agzi.newSingularGeneratedExtension((MessageLite)SenderStateOuterClass$SenderState.getDefaultInstance(), (Object)a2, (MessageLite)a2, (agzn)null, 455760611, ahcm.k, (Class)aqik.class);
    }
    
    private aqik() {
        this.d = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = aqik.f) == null) {
                    synchronized (aqik.class) {
                        if (aqik.f == null) {
                            aqik.f = (ahbe)new agzb((agzi)aqik.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqik.a;
            }
            case 4: {
                return new agza((agzi)aqik.a);
            }
            case 3: {
                return new aqik();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqik.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1001\u0001", new Object[] { "c", "d", "e" });
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
