import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anlr extends agzi implements ahax
{
    public static final anlr a;
    public static final agzg b;
    private static volatile ahbe f;
    public int c;
    public String d;
    public String e;
    
    static {
        final anlr a2 = new anlr();
        agzi.registerDefaultInstance(anlr.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), a2, (MessageLite)a2, null, 473072685, ahcm.k, anlr.class);
    }
    
    private anlr() {
        this.d = "";
        this.e = "";
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
                if ((f = anlr.f) == null) {
                    synchronized (anlr.class) {
                        if (anlr.f == null) {
                            anlr.f = (ahbe)new agzb((agzi)anlr.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return anlr.a;
            }
            case 4: {
                return new agza((agzi)anlr.a);
            }
            case 3: {
                return new anlr();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)anlr.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001", new Object[] { "c", "d", "e" });
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
