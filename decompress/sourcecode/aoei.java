import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoei extends agzi implements ahax
{
    public static final aoei a;
    public static final agzg b;
    private static volatile ahbe i;
    public int c;
    public aqdk d;
    public ajkh e;
    public boolean f;
    public boolean g;
    public CommandOuterClass$Command h;
    private amij j;
    private ahas k;
    private byte l;
    
    static {
        final aoei a2 = new aoei();
        agzi.registerDefaultInstance(aoei.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), a2, (MessageLite)a2, null, 221293762, ahcm.k, aoei.class);
    }
    
    private aoei() {
        this.k = ahas.a;
        this.l = 2;
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
                final ahbe i;
                if ((i = aoei.i) == null) {
                    synchronized (aoei.class) {
                        if (aoei.i == null) {
                            aoei.i = (ahbe)new agzb((agzi)aoei.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return aoei.a;
            }
            case 4: {
                return new agza((agzi)aoei.a);
            }
            case 3: {
                return new aoei();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aoei.a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0001\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1007\u0002\u0005\u1007\u0004\u0006\u1009\u0005\u0007\u1409\u0006\b2", new Object[] { "c", "d", "e", "f", "g", "j", "h", "k", aoeh.a });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.l = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.l;
            }
        }
    }
}
