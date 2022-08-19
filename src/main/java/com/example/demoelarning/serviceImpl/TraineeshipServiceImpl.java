package com.example.demoelarning.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoelarning.models.Traineeship;
import com.example.demoelarning.repository.TraineeshipRepo;
import com.example.demoelarning.service.TraineeshipService;

@Service
public class TraineeshipServiceImpl implements TraineeshipService {
	@Autowired
	private TraineeshipRepo traineeshipRepo;

	@Override
	public Traineeship addTraineeship(Traineeship a) {
		// TODO Auto-generated method stub
		return this.traineeshipRepo.save(a);
	}

	@Override
	public List<Traineeship> getAllTraineeships() {
		// TODO Auto-generated method stub
		return this.traineeshipRepo.findAll();
	}

	@Override
	public Traineeship updateTraineeship(Traineeship a) {
		// TODO Auto-generated method stub
		return this.traineeshipRepo.save(a);
	}

	@Override
	public Traineeship getById(Long id) {
		// TODO Auto-generated method stub
		Optional<Traineeship>t=this.traineeshipRepo.findById(id);
		return t.isPresent()?t.get():null;
	}

	@Override
	public void deleteTraineeship(Long id) {
		// TODO Auto-generated method stub
		this.traineeshipRepo.deleteById(id);
	}
}


