import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amsd extends agzi implements ahax
{
    public static final amsd a;
    public static final agzg b;
    private static volatile ahbe d;
    public agzy c;
    private byte e;
    
    static {
        final amsd a2 = new amsd();
        agzi.registerDefaultInstance(amsd.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), a2, (MessageLite)a2, null, 289177740, ahcm.k, amsd.class);
    }
    
    private amsd() {
        this.e = 2;
        this.c = agzi.emptyProtobufList();
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
                final ahbe d;
                if ((d = amsd.d) == null) {
                    synchronized (amsd.class) {
                        if (amsd.d == null) {
                            amsd.d = (ahbe)new agzb((agzi)amsd.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amsd.a;
            }
            case 4: {
                return new agza((agzi)amsd.a);
            }
            case 3: {
                return new amsd();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amsd.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u041b", new Object[] { "c", amsh.class });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.e = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
