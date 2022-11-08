import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aodw extends agzi implements ahax
{
    public static final aodw a;
    public static final agzg b;
    private static volatile ahbe g;
    public int c;
    public aqdk d;
    public ajzl e;
    public String f;
    private byte h;
    
    static {
        final aodw a2 = new aodw();
        agzi.registerDefaultInstance(aodw.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), a2, (MessageLite)a2, null, 427222820, ahcm.k, aodw.class);
    }
    
    private aodw() {
        this.h = 2;
        this.f = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe g;
                if ((g = aodw.g) == null) {
                    synchronized (aodw.class) {
                        if (aodw.g == null) {
                            aodw.g = (ahbe)new agzb((agzi)aodw.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aodw.a;
            }
            case 4: {
                return new agza((agzi)aodw.a);
            }
            case 3: {
                return new aodw();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aodw.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1008\u0002", new Object[] { "c", "d", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.h = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
