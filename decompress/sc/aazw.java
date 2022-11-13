import java.util.List;
import java.util.Iterator;
import com.google.protos.youtube.api.innertube.ChangeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand;
import com.google.protos.youtube.api.innertube.ChangeMarkersVisibilityCommandOuterClass$ChangeMarkersVisibilityCommand;
import com.google.protos.youtube.api.innertube.LoadMarkersCommandOuterClass$LoadMarkersCommand;
import com.google.protos.youtube.api.innertube.UpdateTimedMarkersSyncObserverCommandOuterClass$UpdateTimedMarkersSyncObserverCommand;
import com.google.protos.youtube.api.innertube.AcknowledgeYouthereEndpointOuterClass$AcknowledgeYouthereEndpoint;
import com.google.protos.youtube.api.innertube.DismissDialogEndpointOuterClass$DismissDialogEndpoint;
import java.util.Map;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aazw implements vcv
{
    private final int a;
    private final Object b;
    
    public aazw(final abap b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public aazw(final abas b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public aazw(final abaz b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public aazw(final abiq b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public aazw(final aeea b, final int a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
        this.b = b;
    }
    
    public aazw(final Context b, final int a) {
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public aazw(final tgd b, final int a) {
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public aazw(final tgd b, final int a, final byte[] array) {
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public final void mE(aiqj aiqj, final Map map) {
        final int a = this.a;
        final int n = 2;
        switch (a) {
            default: {
                Object o2;
                final Object o = o2 = tpe.M(map, (Object)"com.google.android.libraries.youtube.innertube.endpoint.tag");
                if (o instanceof adbk) {
                    o2 = ((adbk)o).b;
                }
                if (o2 != null) {
                    ((tgd)this.b).d((Object)uzo.b(o2));
                }
                return;
            }
            case 7: {
                Object o4;
                final Object o3 = o4 = tpe.M(map, (Object)"com.google.android.libraries.youtube.innertube.endpoint.tag");
                if (o3 instanceof adbk) {
                    final adbk adbk = (adbk)o3;
                    o4 = adbk.b;
                    if (!adbk.a) {
                        ((tgd)this.b).d((Object)new adbw());
                    }
                }
                if (o4 != null) {
                    ((tgd)this.b).d((Object)uzo.b(o4));
                }
                return;
            }
            case 6: {
                final DismissDialogEndpointOuterClass$DismissDialogEndpoint dismissDialogEndpointOuterClass$DismissDialogEndpoint = (DismissDialogEndpointOuterClass$DismissDialogEndpoint)((ahbc)aiqj).rx((ahaq)DismissDialogEndpointOuterClass$DismissDialogEndpoint.dismissDialogEndpoint);
                if ((dismissDialogEndpointOuterClass$DismissDialogEndpoint.b & 0x1) != 0x0) {
                    final Object b = this.b;
                    final String c = dismissDialogEndpointOuterClass$DismissDialogEndpoint.c;
                    tbi.f();
                    final Iterator iterator = ((afba)((aeea)b).a).e((Object)c).iterator();
                    while (iterator.hasNext()) {
                        ((acay)iterator.next()).nu();
                    }
                    return;
                }
                ((aeea)this.b).ar();
                return;
            }
            case 5: {
                final AcknowledgeYouthereEndpointOuterClass$AcknowledgeYouthereEndpoint acknowledgeYouthereEndpointOuterClass$AcknowledgeYouthereEndpoint = (AcknowledgeYouthereEndpointOuterClass$AcknowledgeYouthereEndpoint)((ahbc)aiqj).rx((ahaq)AcknowledgeYouthereEndpointOuterClass$AcknowledgeYouthereEndpoint.acknowledgeYouthereEndpoint);
                if ((acknowledgeYouthereEndpointOuterClass$AcknowledgeYouthereEndpoint.b & 0x1) != 0x0) {
                    final Object b2 = this.b;
                    apvt apvt;
                    if ((apvt = acknowledgeYouthereEndpointOuterClass$AcknowledgeYouthereEndpoint.c) == null) {
                        apvt = apvt.a;
                    }
                    ((abiq)b2).d(apvt);
                }
                return;
            }
            case 4: {
                final UpdateTimedMarkersSyncObserverCommandOuterClass$UpdateTimedMarkersSyncObserverCommand updateTimedMarkersSyncObserverCommandOuterClass$UpdateTimedMarkersSyncObserverCommand = (UpdateTimedMarkersSyncObserverCommandOuterClass$UpdateTimedMarkersSyncObserverCommand)((ahbc)aiqj).rx((ahaq)UpdateTimedMarkersSyncObserverCommandOuterClass$UpdateTimedMarkersSyncObserverCommand.updateTimedMarkersSyncObserverCommand);
                final int b3 = updateTimedMarkersSyncObserverCommandOuterClass$UpdateTimedMarkersSyncObserverCommand.b;
                if ((b3 & 0x1) != 0x0 && (b3 & 0x2) != 0x0 && (b3 & 0x4) != 0x0) {
                    if (updateTimedMarkersSyncObserverCommandOuterClass$UpdateTimedMarkersSyncObserverCommand.c) {
                        Object o5;
                        if ((b3 & 0x8) != 0x0) {
                            if ((aiqj = updateTimedMarkersSyncObserverCommandOuterClass$UpdateTimedMarkersSyncObserverCommand.f) == null) {
                                aiqj = aiqj.a;
                            }
                            o5 = aezp.k((Object)aiqj);
                        }
                        else {
                            o5 = aeyo.a;
                        }
                        int n2 = n;
                        if ((updateTimedMarkersSyncObserverCommandOuterClass$UpdateTimedMarkersSyncObserverCommand.b & 0x10) != 0x0) {
                            if (updateTimedMarkersSyncObserverCommandOuterClass$UpdateTimedMarkersSyncObserverCommand.g) {
                                n2 = n;
                            }
                            else {
                                n2 = 1;
                            }
                        }
                        ((abaz)this.b).k(updateTimedMarkersSyncObserverCommandOuterClass$UpdateTimedMarkersSyncObserverCommand.d, updateTimedMarkersSyncObserverCommandOuterClass$UpdateTimedMarkersSyncObserverCommand.e, (aezp)o5, n2);
                        return;
                    }
                    ((abaz)this.b).j(updateTimedMarkersSyncObserverCommandOuterClass$UpdateTimedMarkersSyncObserverCommand.d, updateTimedMarkersSyncObserverCommandOuterClass$UpdateTimedMarkersSyncObserverCommand.e);
                }
                return;
            }
            case 3: {
                final LoadMarkersCommandOuterClass$LoadMarkersCommand loadMarkersCommandOuterClass$LoadMarkersCommand = (LoadMarkersCommandOuterClass$LoadMarkersCommand)((ahbc)aiqj).rx((ahaq)LoadMarkersCommandOuterClass$LoadMarkersCommand.loadMarkersCommand);
                if (loadMarkersCommandOuterClass$LoadMarkersCommand.c.size() != 0) {
                    final Iterator<Object> iterator2 = ((List<Object>)loadMarkersCommandOuterClass$LoadMarkersCommand.c).iterator();
                    while (iterator2.hasNext()) {
                        ((abas)this.b).a(iterator2.next());
                    }
                    final Iterator<Object> iterator3 = ((List<Object>)loadMarkersCommandOuterClass$LoadMarkersCommand.b).iterator();
                    while (iterator3.hasNext()) {
                        ((abas)this.b).b(true, iterator3.next());
                    }
                }
                return;
            }
            case 2: {
                final ChangeMarkersVisibilityCommandOuterClass$ChangeMarkersVisibilityCommand changeMarkersVisibilityCommandOuterClass$ChangeMarkersVisibilityCommand = (ChangeMarkersVisibilityCommandOuterClass$ChangeMarkersVisibilityCommand)((ahbc)aiqj).rx((ahaq)ChangeMarkersVisibilityCommandOuterClass$ChangeMarkersVisibilityCommand.changeMarkersVisibilityCommand);
                if ((changeMarkersVisibilityCommandOuterClass$ChangeMarkersVisibilityCommand.b & 0x1) != 0x0) {
                    if (changeMarkersVisibilityCommandOuterClass$ChangeMarkersVisibilityCommand.d.size() != 0) {
                        final Iterator<Object> iterator4 = ((List<Object>)changeMarkersVisibilityCommandOuterClass$ChangeMarkersVisibilityCommand.d).iterator();
                        while (iterator4.hasNext()) {
                            ((abas)this.b).b(changeMarkersVisibilityCommandOuterClass$ChangeMarkersVisibilityCommand.c, iterator4.next());
                        }
                    }
                }
                return;
            }
            case 1: {
                zvf.f((Context)this.b);
                return;
            }
            case 0: {
                final ChangeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand changeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand = (ChangeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand)((ahbc)aiqj).rx((ahaq)ChangeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand.changeKeyedMarkersVisibilityCommand);
                final int b4 = changeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand.b;
                if ((b4 & 0x1) != 0x0 && (b4 & 0x2) != 0x0) {
                    ((abap)this.b).g(changeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand.d, changeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand.c);
                }
            }
        }
    }
}
