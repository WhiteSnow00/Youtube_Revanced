import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anlw extends agzi implements ahax
{
    public static final anlw a;
    public static final agzg b;
    private static volatile ahbe i;
    public String c;
    public String d;
    public int e;
    public String f;
    public int g;
    public agzy h;
    private int j;
    
    static {
        final anlw a2 = new anlw();
        agzi.registerDefaultInstance(anlw.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), a2, (MessageLite)a2, null, 406356191, ahcm.k, anlw.class);
    }
    
    private anlw() {
        this.c = "";
        this.d = "";
        this.f = "";
        this.h = agzi.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe i;
                if ((i = anlw.i) == null) {
                    synchronized (anlw.class) {
                        if (anlw.i == null) {
                            anlw.i = (ahbe)new agzb((agzi)anlw.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return anlw.a;
            }
            case 4: {
                return new agza((agzi)anlw.a);
            }
            case 3: {
                return new anlw();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)anlw.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u100c\u0002\u0004\u1008\u0003\u0005\u100c\u0004\u0006\u001b", new Object[] { "j", "c", "d", "e", ajkr.f, "f", "g", angs.n, "h", anlu.class });
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
