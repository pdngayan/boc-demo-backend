docker build  -t pdngayan1/backend .
docker push pdngayan1/backend

docker run -p 8080:8080 pdngayan1/backend



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


git init
git add .
git commit -m "Add existing project files to Git"
git remote add origin https://github.com/pdngayan/boc-demo-backend.git
git push --set-upstream origin main 


docker run -it -p 80:8080 -p 50000:50000 -v /var/run/docker.sock:/var/run/docker.sock -v jenkins4:/var/jenkins_home -d pdngayan1/jenkins-docker-kubectl

rollout updates
---
kubectl set image deployments/backend backend=pdngayan1/frontend

Gayan
//sachin