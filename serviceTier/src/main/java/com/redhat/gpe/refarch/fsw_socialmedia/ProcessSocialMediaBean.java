package com.redhat.gpe.refarch.fsw_socialmedia;

import org.switchyard.component.bean.Service;

@Service(IProcessSocialMedia.class)
public class ProcessSocialMediaBean implements IProcessSocialMedia {

	@Override
	public void processTwitter(String mesg) {
		// TODO Auto-generated method stub
		System.out.println(mesg);

	}

	@Override
	public void processFacebook(String mesg) {
		// TODO Auto-generated method stub

	}

}
